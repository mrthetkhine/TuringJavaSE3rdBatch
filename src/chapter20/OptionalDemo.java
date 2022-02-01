/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Optional;

/**
 *
 * @author thetkhine
 */
public class OptionalDemo {
    public static void main(String[] args) {
        //String str = null;
        //System.out.println("Str "+ (str.toUpperCase()));
        
        Optional<String> optStr = Optional.empty();
        optStr = Optional.of("Test");
        System.out.println("Is Present "+ optStr.isPresent());
        //System.out.println("get "+optStr.get());
        System.out.println("Use "+optStr.orElse("Hello"));
        
        Optional<String> result = optStr.filter(str-> str.length()>3);
        System.out.println("Result "+result);
        
        result = optStr.map(str-> str.toUpperCase())
                       .map(str-> str+" hi")
                        ;
               
        String data = null;
        if(data != null)
        {
            data = data.toUpperCase();
            if(data != null)
            {
                data = data + " hi";
            }
        }
        System.out.println("Result "+result.orElse("Nothing"));
    }
}
