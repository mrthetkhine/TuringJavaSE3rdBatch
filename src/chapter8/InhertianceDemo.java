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
/*
class OrthoSpecialist extends Specialist
{
}
*/
public class InhertianceDemo {
    public static void main(String[] args) {
        
        Human d = new Doctor("Aung Kyaw",25,"Ortho");
        d.work();
        //d.walk();
      
        d = new Human("Aung Aung",16);
        d.work();
        //System.out.println("Doctor "+d.name);
        System.out.println("Instance of "+ d instanceof Object);
        
    }
}
