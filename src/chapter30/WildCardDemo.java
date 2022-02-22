/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author thetkhine
 */
public class WildCardDemo {
    public static void main(String[] args) {
        String input = "00112 Hello12393";
        
        Pattern digits = Pattern.compile("[0-9]+");
        Matcher matcher = digits.matcher(input);
        
        System.out.println("Find "+ matcher.find());
        
        System.out.println("(\"[0-9]+.K "+ ("0101AK".matches("[0-9]+.K")));
        System.out.println("(\"[0-9]+.K "+ ("0101AB".matches("[0-9]+.K")));
        
        System.out.println("* "+ ("0101K".matches("[0-9]+.*K")));
        System.out.println("* "+ ("0101AK".matches("[0-9]+.*K")));
        System.out.println("* "+ ("0101AEEK".matches("[0-9]+.*K")));
        
        System.out.println("? "+ ("0101AK".matches("[0-9]+.?K")));
        System.out.println("? "+ ("0101K".matches("[0-9]+.?K")));
        System.out.println("? "+ ("0101AEEK".matches("[0-9]+.?K")));
    }
}
