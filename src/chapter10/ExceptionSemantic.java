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
public class ExceptionSemantic {
    static int method()
    {
        try
        {
            throw new NullPointerException("Custom throw exception");
            //return 30;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            return 20;
            //throw new NullPointerException("Custom rethrow exception");
        }
        finally{
            System.out.println("Finally always win");
            //return 30;
            //throw new NullPointerException("Custom rethrow exception in finally");
        }
    }
    public static void main(String[] args) {
        int result = method();
        System.out.println("Result "+result);
    }
}
