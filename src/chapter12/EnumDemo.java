/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

import static chapter12.Gender.Male;

/**
 *
 * @author thetkhine
 */
enum Gender
{
    Male,Female;
}
public class EnumDemo {
    public static void main(String[] args) {
        Gender gender = Gender.Male;
        
        if(gender == Male)
        {
            System.out.println("Gender is "+ gender);
        }
        switch( gender)
        {
            case Male:
                System.out.println("It is male");
                break;
            case Female:
                System.out.println("It is female");
                break;
            default:
                System.out.println("None else");
        }
        for(Gender g : Gender.values())
        {
            System.out.println("Gender "+g); 
        }
        
        Gender another = Gender.valueOf("Female");
        System.out.println("Another "+another);
        
    }
}
