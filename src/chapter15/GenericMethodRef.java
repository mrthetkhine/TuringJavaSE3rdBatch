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
interface MyFunc<T extends Number>
{
    int op(T[] vals);
}
public class GenericMethodRef {
    static<T extends Number> int sum(T[]arr)
    {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            res += arr[i].intValue();
        }
        return res;
    }
    public static void main(String[] args) {
        MyFunc<Integer> func = GenericMethodRef::sum;
        int result = func.op(new Integer[]{1,2,3});
        System.out.println("Result "+result);
    }
}
