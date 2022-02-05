/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.ListResourceBundle;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author thetkhine
 */


public class ResourceBundleDemo {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("chapter20.SampleRB");
        System.out.println("GetString title "+rb.getString("title"));
        
        rb = ResourceBundle.getBundle("chapter20.SampleRB",Locale.GERMAN);
        System.out.println("GetString title "+rb.getString("title"));
    }
}
