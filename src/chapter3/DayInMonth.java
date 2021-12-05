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
public class DayInMonth {
    public static void main(String[] args) {
        int dayinMonths[] ={ 31,28,30,31,30,29,31,30,31,31,31};
        int feb = 1;
        
        System.out.println("Day "+ dayinMonths[feb]);
        
        int days[] = new int[12];
        System.out.println("Length "+days.length);
        
        int matrix[][] = new int[3][];
        matrix[0] = new int[10];
        matrix[1] = new int[5];
        matrix[2] = new int[20];
    }
}
