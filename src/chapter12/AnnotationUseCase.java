/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Field;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
@Retention(RUNTIME)
@interface NotNull
{
    String message() default "field should not be nulled";
}
class Data
{
    @NotNull
    String name;
    String school;
    
    @NotNull(message="address should not be nulled")
    String address;
}

class DTO
{
    @NotNull(message="age should not be nulled")
    Integer age;
    String school;
    
    @NotNull(message="address should not be nulled")
    String address;
}
public class AnnotationUseCase {
    
    public static void check(Object obj)
    {
        //Get field
        Field fields[] = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field "+field.getName());
            Annotation[] annos =  field.getDeclaredAnnotations();
            for (Annotation ano : annos) {
                //System.out.println("Anno "+ano);
                if(ano instanceof NotNull)
                {
                    try {
                        //System.out.println("Have Not Null");
                        Object fieldValue = field.get(obj);
                        if(fieldValue == null)
                        {
                            NotNull notNull = (NotNull)ano;
                            System.out.println("Field "+ field.getName()+" "+notNull.message());
                        }
                    } catch (IllegalArgumentException ex) {
                        ex.printStackTrace();
                    } catch (IllegalAccessException ex) {
                        ex.printStackTrace();
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        Data data = new Data();
        //data.name = "Name";
        data.school = "School";
        
        check(data);
        DTO dto = new DTO();
        
        check(dto);
        
    }
}
