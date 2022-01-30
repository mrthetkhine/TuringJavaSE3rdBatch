/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter19;

import java.util.HashMap;

/**
 *
 * @author thetkhine
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String,String>();
        
        map.put("1", "value one");
        map.put("lang", "Java");
        map.put("lang", "JS");
        System.out.println("Get "+map.get("lang"));
        
        for (String key : map.keySet()) {
            System.out.println("Key "+key);
        }
        for (String value : map.values()) {
            System.out.println("Key "+value);
        }
        for(HashMap.Entry<String,String> entries : map.entrySet())
        {
            System.out.println("Key "+entries.getKey() + " Value "+entries.getValue());
        }
    }
}
