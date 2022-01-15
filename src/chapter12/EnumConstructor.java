/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter12;

/**
 *
 * @author thetkhine
 */
enum Size
{
    Small(1), Medium(2),Large(3);
    
    int size;
    Size(int size)
    {
        this.size = size;
    }
    
    int getSize()
    {
        return this.size;
    }
    
}
public class EnumConstructor {
    public static void main(String[] args) {
        Size size = Size.Small;
        
        if( size.getSize() < Size.Medium.getSize())
        {
            System.out.println("Small is less than medium");
        }
        System.out.println("Ordinal "+ size.ordinal());
        System.out.println("Ordinal Medium "+ Size.Medium.ordinal());
        System.out.println("CompareTo "+ Size.Medium.compareTo(Size.Large));
    }
}
