/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class Box {
    double width;
    double height;
    double depth;
    
    double volume()
    {
        return this.width* this.height * this.depth;
    }
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 10;
        box.height = 2;
        box.depth = 3;
        
        System.out.println("Box volume "+ box.volume());
    }
}
