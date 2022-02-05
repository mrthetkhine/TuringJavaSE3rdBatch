/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Random;

/**
 *
 * @author thetkhine
 */
public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        String[] messages = {"Hello","How are you","How are you doing"};
        
        System.out.println("Message "+ messages[random.nextInt(messages.length)]);
        
        System.out.println("Next Double "+ random.nextDouble());
        System.out.println("Gaussian "+random.nextGaussian());
    }
}
