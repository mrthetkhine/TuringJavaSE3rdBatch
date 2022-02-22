/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ReflectionDemo {
    public static void main(String[] args) {
        try {
            Class<?> clazz = Class.forName("java.lang.System");
            Field fields [] =clazz.getDeclaredFields();
            for(Field field: fields)
            {
                System.out.println("Field Name "+field.getName() + " Type "+field.getType());
            }
            
            System.out.println("Random--------");
            Class<?> randomClaz = Class.forName("java.util.Random");
            fields =randomClaz.getDeclaredFields();
            for(Field field: fields)
            {
                System.out.println("Field Name "+field.getName() + " Type "+field.getType());
            }
            Method[]methods = randomClaz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method "+method.getName() + " ReturnType "+method.getReturnType());
            }
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReflectionDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
