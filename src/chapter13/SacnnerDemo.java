/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter13;

import java.util.Scanner;

/**
 *
 * @author thetkhine
 */
public class SacnnerDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter name");
        String name = scanner.nextLine();
        
        System.out.println("Hello "+name);
    }
}
