/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

/**
 *
 * @author thetkhine
 */
public class CharacterClassDemo {
    public static void main(String[] args) {
        System.out.println("haello.[^abc]+ " + ("haello".matches("[^abc]+")));
        System.out.println("hello.[^abc]+ " + ("hello".matches("[^abc]+")));
         
         
        System.out.println("afg.[a-c[f-h]]+ " + ("afg".matches("[a-c[f-h]]+")));
        System.out.println("cf.[a-c[f-h]]+ " + ("cf".matches("[a-c[f-h]]+")));
        
        
        System.out.println("bc.[a-c[f-h]]+ " + ("bc".matches("[a-c&&[b-c]]+")));
        System.out.println("dbc.[a-c[f-h]]+ " + ("dbbc".matches("[a-c&&[b-c]]+")));
        
        
        System.out.println("aa.[a-c&&[^b-c]]+ " + ("aa".matches("[a-c&&[^b-c]]+")));
        System.out.println("abe.[a-c&&[^b-c]]+ " + ("abe".matches("[a-c&&[^b-c]]+")));
    }
}
