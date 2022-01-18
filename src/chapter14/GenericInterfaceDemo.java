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
interface MinMax<T extends Comparable<T>>
{
    T max();
    T min();
}
class MinMaxImpl<T extends Comparable<T>> implements MinMax<T>
{
    T[] vals;
    MinMaxImpl(T[] vals)
    {
        this.vals = vals;
    }
    @Override
    public T max() {
        T max = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(max.compareTo(vals[i])<0)
            {
                max = vals[i];
            }
        }
        return max;
    }

    @Override
    public T min() {
        T min = vals[0];
        for (int i = 1; i < vals.length; i++) {
            if(min.compareTo(vals[i])>0)
            {
                min = vals[i];
            }
        }
        return min;
    }
}
public class GenericInterfaceDemo {
    public static void main(String[] args) {
        Integer nums[] = new Integer[]{2,3,5,8,11,0};
        MinMaxImpl<Integer> impl = new MinMaxImpl<Integer>(nums);
        
        Integer max = impl.max();
        System.out.println("Max "+max);
        
        Integer min = impl.min();
        System.out.println("Min "+min);
    }
}
