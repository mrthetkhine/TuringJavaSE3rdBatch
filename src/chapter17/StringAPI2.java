/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter17;

/**
 *
 * @author thetkhine
 */
public class StringAPI2 {
    public static void main(String[] args) {
        System.out.println("indexOf "+ ("Java Programming Programming".indexOf("Program")));
        System.out.println("indexOf "+ ("Java Programming".indexOf("Programi")));
        System.out.println("lastIndexOf "+ ("Java Programming Programming".lastIndexOf("Program")));
        System.out.println("indexOf "+ ("Java Programming Programming".indexOf("Program",11)));
        
        System.out.println("substring "+ ("Java Programming Programming".substring(1,6)));
        System.out.println("substring "+ ("Java Programming Programming".substring(1)));
        System.out.println("concat "+ ("Java Programming".concat(" JavaScript")));
        System.out.println("replace "+ ("Java Programming".replace("Java"," JavaScript")));
        
        System.out.println("trim "+ (" \r\t\nJava Programming ".trim()));
        
        String data = String.valueOf(311);
        System.out.println("Data "+data);
        
        System.out.println("join "+( String.join(":", "Hello","World")));
        
        String str = "Hello,How, are you";
        String []arr  = str.split(",");
        for (String s : arr) {
            System.out.println("S "+s);
        }
        
    }
}
