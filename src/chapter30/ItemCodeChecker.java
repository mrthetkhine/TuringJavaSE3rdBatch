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
public class ItemCodeChecker {
    public static boolean isValidItemCode(String itemCode)
    {
        
        if(itemCode == null || itemCode.length()<4)
        {
            return false;
        }
        boolean isStartWithIte = itemCode.startsWith("ITE");
        if(isStartWithIte)
        {
            String digits = itemCode.substring("ITE".length(), itemCode.length());
            System.out.println("Digit "+digits);
            
            boolean allDigit = true;
            for (int i = 0; i < digits.length(); i++) {
                allDigit = allDigit && Character.isDigit(digits.charAt(i));
            }
            return allDigit;
        }
        
        return false;
    }
    public static boolean isValidItemCodeWithRE(String itemCode)
    {
        
        Pattern pattern = Pattern.compile("ITE[0-9]+");
        Matcher matcher = pattern.matcher(itemCode);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String itemCode = "ITE000011";
        System.out.println("ValidItemCode "+ isValidItemCode("ITE"));
        System.out.println("isValid with RE "+ isValidItemCodeWithRE(itemCode));
        
        Pattern digits = Pattern.compile("[0-9]+");
        Matcher matcher = digits.matcher(itemCode);
        System.out.println("finds "+matcher.find());
        System.out.println("Finds "+matcher.find(4));
    }
}
