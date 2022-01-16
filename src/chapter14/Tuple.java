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
class Division
{
    public static Tuple<Error,Double> div(float divisor, float dividend)
    {
        Tuple<Error,Double> result;
        if(dividend == 0)
        {
            result = new Tuple(new Error("Division by zero "),null);
            return result;
        }
        else
        {
            result = new Tuple(null, divisor/ dividend);
            return result;
        }
    }
}
public class Tuple<T,V> {
    
    T first;
    V second;
    
    Tuple(T first, V second)
    {
        this.first = first;
        this.second = second;
    }
    T getFirst()
    {
        return this.first;
    }
    V getSecond()
    {
        return this.second;
    }
    public static void main(String[] args) {
        Tuple<String,Integer> tuple = new Tuple("Hello",1);
        System.out.println("First "+ tuple.getFirst());
        System.out.println("Second "+ tuple.getSecond());
        
        Tuple<Error,Double> result = Division.div(13, 10);
        if(result.getFirst() != null)
        {
            System.out.println("Error "+ result.getFirst());
        }
        else
        {
            System.out.println("Result "+ result.getSecond());
        }
    }
}
