/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.BitSet;

/**
 *
 * @author thetkhine
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bOne = new BitSet(3);//101
        bOne.set(0,true);
        bOne.set(1,false);
        bOne.set(2,true);
        
        BitSet bTwo = new BitSet(3);//111
        bTwo.set(0,true);
        bTwo.set(1,true);
        bTwo.set(2,true);
        
        bOne.and(bTwo);
        System.out.println("BOne "+bOne);
    }
}
