/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.StringTokenizer;

/**
 *
 * @author thetkhine
 */
public class StringTokenizerDemo {
    public static void main(String[] args) {
        String str = "data;hello,how are you";
        
        StringTokenizer tokenizer = new StringTokenizer(str,";, ");
        
        while( tokenizer.hasMoreTokens())
        {
            System.out.println("Next "+tokenizer.nextToken());
        }
    }
}
