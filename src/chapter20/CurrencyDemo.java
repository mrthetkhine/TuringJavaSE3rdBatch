/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Calendar;
import java.util.Currency;
import java.util.Formatter;

/**
 *
 * @author thetkhine
 */
public class CurrencyDemo {
    public static void main(String[] args) {
        for(Currency c : Currency.getAvailableCurrencies())
        {
            //System.out.println("C "+c);
        }
        Currency mmk = Currency.getInstance("MMK");
        System.out.println("MMK Symbol"+mmk.getSymbol());        
        System.out.println("MMK "+mmk.getDisplayName());
        System.out.println("NumericCode "+mmk.getNumericCode());
        System.out.println("Fract "+mmk.getDefaultFractionDigits());
        
        Formatter formatter = new Formatter();
        formatter = formatter.format("Formatting %s is easy %d |%,12.3f|", "with Java", 10,1298.6);
        System.out.println("Formatter "+formatter.toString());
        
        Calendar cal = Calendar.getInstance();
        
        try(Formatter fmt = new Formatter())
        {
            fmt.format("Date is %tr", cal);
            System.out.println(fmt.toString());
        }
        System.out.printf("Amount is %015d",124);
       
    }
}
