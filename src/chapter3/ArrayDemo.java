/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author thetkhine
 */
public class ArrayDemo {
    public static void main(String[] args) {
        int mark0 = 30;
        int mark1 = 40;
        int mark2 = 40;
        int mark3 = 50;
        int mark4 = 60;
       
        int[] marks = {10,20,30,50,60};
        System.out.println("mark [0] "+ marks[0]);
        System.out.println("mark [4] "+ marks[4]);
        
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            total  += marks[i];
        }
        System.out.println("Total "+total);
    }
}
