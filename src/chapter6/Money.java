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
public class Money {
    String currency;
    double value;
    
    Money(String currency, double value)
    {
        this.currency = currency;
        this.value = value;
        System.out.println("Constructor");
    }
    /*
    void setCurrencyAndValue(String c, double v)
    {
        this.currency = c;
        this.value = v;
    }
    */  
    public Money add(Money another)
    {
        if(this.currency.equals(another.currency))
        {  
            return new Money(this.currency, this.value + another.value);
        }
        else
        {
            Money result = new Money("InvalidCurrency",0);
        
            
            return result;
        }
    }
    public static void main(String[] args) {
        
        //Money m4 = new Money();
        Money m1 = new Money("$",10);
    
        Money m2 = new Money("$",20);
        
        Money m3 = m1.add(m2);
        System.out.println("M3 "+ m3.currency + " "+m3.value);
    }
}
