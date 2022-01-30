/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.EnumSet;

/**
 *
 * @author thetkhine
 */
enum Gender
{
    MALE, FEMALE;
}
public class EnumSetDemo {
    public static void main(String[] args) {
        EnumSet<Gender> gender = EnumSet.of(Gender.MALE);
        
        gender.add(Gender.FEMALE);
        gender.add(Gender.MALE);
        
        for (Gender g : gender) {
            System.out.println("Gender "+g);
        }
    }
}
