/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter10;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ThrowExample {
    
    static int div(int a, int b) throws Exception
    {
        if(b == 0)
        {
            throw new Exception("B is zero division by zero");
        }
        else
        {
            return a/b;
        }
    }
    public static void main(String[] args) {
        try 
        {
            int result = div(1,2);
            System.out.println("Result "+result);
        }
        catch (Exception ex) {
            System.out.println("Ex "+ex.getMessage());
        }
        finally
        {
            System.out.println("Always run");
        }
    }
}
