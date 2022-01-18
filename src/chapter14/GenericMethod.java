/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
public class GenericMethod {
    static <T extends Number> double average(T[] numbers)
    {
        double avg = 0;
        for (int i = 0; i < numbers.length; i++) {
            avg += numbers[i].doubleValue();
        }
        avg = avg / numbers.length;
        return avg;
    }
    public static void main(String[] args) {
        Integer [] ints = new Integer[]{1,2,3};
        
        double avg = average(ints);
        System.out.println("Average "+avg);
    }
}
