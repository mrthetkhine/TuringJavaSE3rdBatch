/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;
import java.lang.reflect.Field;

/**
 *
 * @author thetkhine
 */

public class AnnotationReflectionDemo {
    String filedOne;
    int fieldTwo;
    
    public static void main(String[] args) {
        
        AnnotationReflectionDemo demo = new AnnotationReflectionDemo();
        
        Class c = demo.getClass();
        System.out.println("Class "+ c.getName());
        
        Field[] fields = c.getDeclaredFields();
        for (Field field :fields) {
            System.out.println("FieldName "+ field.getName() + " Type "+ field.getType());
        }
        
    }
}
