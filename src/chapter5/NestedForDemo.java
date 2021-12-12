/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter5;

/**
 *
 * @author thetkhine
 */
public class NestedForDemo {
    public static void main(String[] args) {
        int [][]matrix = {
            {1,2,3},
            {4,5,6,7,8},
            {9,10,11,12,13,14}
                
        };
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Matrix "+i + " length "+ matrix[i].length);
            
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Matrix "+ i+","+j + " => "+ matrix[i][j]);
            }
        }
    }
}
