/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

/**
 *
 * @author thetkhine
 */
public class DivisionByZeroException {
    
    static void method()
    {
         System.out.println("1/0 "+ 1/1);
    }
    
    public static void main(String[] args) {
        
        try
        {
            method();
            try
            {
                 
                int arr[] = new int[3];
                arr[-1] = 200;
                System.out.println("Not run");
            }
            catch(Exception e)
            {
                System.out.println("Inner error "+e.getMessage());
                e.printStackTrace();
            }
        }
        catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Division by zero "+e);
            e.printStackTrace();
        }
        catch(Exception e)
        {
            System.out.println("Other error "+e.getMessage());
            e.printStackTrace();
        }
       
        System.out.println("Never run");
    }
}
