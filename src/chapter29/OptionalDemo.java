/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter29;

import java.util.Optional;

/**
 *
 * @author thetkhine
 */
public class OptionalDemo {
    public static void main(String[] args) {
        Optional<Integer> data = Optional.empty();
        data = Optional.of(10);
        System.out.println("isPresent "+ data.isPresent());
        //System.out.println("Get "+data.get());
        System.out.println("OrElse "+data.orElse(3));
    }
}
