/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class InvokeMethod {
    public static void main(String[] args) {
        try {
            Class<?> humanClass = Class.forName("chapter30.Human");
            Object human = humanClass.newInstance();
            
            Field field = humanClass.getDeclaredField("name");
            field.setAccessible(true);
            Object value = field.get(human);
            
            System.out.println("Value "+value);
            
            field.set(human, "Change");
            Method method = humanClass.getDeclaredMethod("display", null);
            method.invoke(human, null);
            System.out.println("Method "+method);
            
            //System.out.println("Filed "+field);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchFieldException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SecurityException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NoSuchMethodException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalArgumentException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InvocationTargetException ex) {
            Logger.getLogger(InvokeMethod.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
