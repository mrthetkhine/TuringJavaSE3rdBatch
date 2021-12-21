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
public class Varargs {
    public static int average(String str, int ... data)
    {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        return sum / data.length;
    }
    public static void main(String ...args) {
        System.out.println("Hello");
        System.out.println("Average 2,3=>"+ average("Average",2,3));
        System.out.println("Average 2,3,4,6=>"+ average("Average ",2,3,4,5,6,7));
        System.out.println("Average 2,3,4,6=>"+ average("Average "));
    }
}
