/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import java.lang.annotation.Retention;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 *
 * @author thetkhine
 */

@Retention(RUNTIME)
@interface Valid
{
    String message();
}
@Valid(message="Test")
public class AnnotationDemo {
    
    @Valid(message="Hello")
    static void method()
    {
        
    }
    public static void main(String[] args) {
        System.out.println("Demo ");
    }
}
