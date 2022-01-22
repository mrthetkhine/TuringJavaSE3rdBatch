/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
interface DoubleNumericArrayFunc{
    double func(double[]n)throws EmptyArrayException;
}
class EmptyArrayException extends Exception
{
    EmptyArrayException()
    {
        super("Empty Array");
    }
}
public class LambdaWithException {
    public static void main(String[] args) {
        DoubleNumericArrayFunc avgFunc = (arr)->{
            if(arr.length==0)
            {
                throw new EmptyArrayException();
            }
            else
            {
                double avg = 0;
                for (int i = 0; i < arr.length; i++) {
                    avg += arr[i];
                }
                return avg/arr.length;
            }
        };
        try {
            double average = avgFunc.func(new double[]{1,2,3});
            System.out.println("Average "+average);
        } catch (EmptyArrayException ex) {
            ex.printStackTrace();
        }
    }
}
