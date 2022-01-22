/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter15;

/**
 *
 * @author thetkhine
 */
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
public class PredefinedInterface {
    static Integer method(Integer a)
    {
        System.out.println("a is "+a);
        return a* a;
    }
    
    public static void main(String[] args) {
        UnaryOperator<Integer> op = PredefinedInterface::method;
        System.out.println("OP "+op.apply(10));
        
        BinaryOperator<Integer> binary = (a,b)->a+b;
        System.out.println("Binary "+ binary.apply(20, 10));
        
        Consumer<Integer> consumer = (a)->{
            System.out.println("A is "+a);
        };
        consumer.accept(200);
        
        Supplier<Integer> supplier = ()->{
            System.out.println("Supplier return ");
            return 300;
        };
        System.out.println("Supplier "+ supplier.get());
        
        Function<Integer,Double> fun = (a)->{
            return a * 3.1;
        };
        System.out.println("Func "+fun.apply(20));
        
        Predicate<Integer> pred = (a)-> a%2 ==0;
        System.out.println("Pred "+ pred.test(20));
    }
}
