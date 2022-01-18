/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter14;

/**
 *
 * @author thetkhine
 */
class GenericNumber<T extends Number>
{
    T[] numbers;
    
    GenericNumber(T[] numbers)
    {
        this.numbers = numbers;
    }
    double average()
    {
        double result =0;
        for (int i = 0; i < numbers.length; i++) {
            result += numbers[i].doubleValue();
        }
        result /= numbers.length;
        return result;
    }
    boolean sameAverage(GenericNumber<?> other)
    {
        return average() == other.average();
    }
}
public class BoundedTypeDemo {
    public static void main(String[] args) {
        Integer ints [] = new Integer[]{1,2,3,4};
        Float floats[] = new Float[]{1.0f,2.0f,3.0f,4.0f};
        
        GenericNumber gn = new GenericNumber<Integer>(ints);
        GenericNumber gnFloat = new GenericNumber<Float>(floats);
        double average = gn.average();
        System.out.println("Average "+average);
        
        boolean sameAverage = gn.sameAverage(gnFloat);
        System.out.println("Same Average "+sameAverage);
    }
}
