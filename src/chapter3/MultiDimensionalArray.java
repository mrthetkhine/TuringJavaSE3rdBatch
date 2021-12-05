/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter3;

/**
 *
 * @author thetkhine
 */
public class MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9,10,11,12}
        };
        System.out.println("Matrix "+matrix[2]);
        System.out.println("Matrix "+matrix[2][0]);
    }
}
