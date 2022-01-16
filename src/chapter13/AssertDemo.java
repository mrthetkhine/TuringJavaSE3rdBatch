/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;
import static java.lang.System.out;
import static java.lang.Math.pow;
/**
 *
 * @author thetkhine
 */
public class AssertDemo {
    public static void main(String[] args) {
        assert 1 > 10;
        out.println("Ok");
        out.println("");
        
        System.out.println("Pow "+pow(2, 3));
    }
}
