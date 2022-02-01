/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Date;

/**
 *
 * @author thetkhine
 */
public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Date "+date);
        System.out.println("After "+ date.after(new Date()));
        System.out.println("Before "+ date.before(new Date()));
        
        System.out.println("Rest mili "+date.getTime());
        long mili = 1643725325501L;
        Date date2 = new Date(mili); 
        
        System.out.println("Date "+date2);
        System.out.println("Compare "+date.compareTo(date2));
    }
}
