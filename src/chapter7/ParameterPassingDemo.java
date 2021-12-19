/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter7;

/**
 *
 * @author thetkhine
 */
public class ParameterPassingDemo {
    
    static void change(int a)
    {
        a = 100;
    }
    static void change(Data d)
    {
        d.value ++;
    }
    static void change2(Data d)
    {
        d = new Data(200);
        d.value ++;
    }
    public static void main(String[] args) {
        int c = 20;
        change(c);
        
        System.out.println("C "+c);
        
        //a = data;
        change(23);
        
        Data d = new Data(100);
        change(d);
        
        System.out.println("D "+ d.value);
        
        change2(d);
        System.out.println("D "+ d.value);
        int MegaBytes = 10241024;
        System.out.println("System Memory "+Runtime.getRuntime().freeMemory()/MegaBytes);
    }
    
}
