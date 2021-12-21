/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author thetkhine
 */
public class Doctor extends Human {
    String specialiation;
    
    public Doctor(String name, int age,String specialiation)
    {
        super(name,age);
        this.specialiation = specialiation;
        System.out.println("Doctor constructor");
    }
    public void work()
    {
        super.work();
        System.out.println("Doctor "+this.name+" treat patient");
    }
    public void publishPaper()
    {
        System.out.println("Publish paper");
    }
}
