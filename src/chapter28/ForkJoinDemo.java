/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.Random;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author thetkhine
 */
class SquareDivideConquer extends RecursiveAction
{

    double vals[];
    int start,end;
    int treshold = 10;
    SquareDivideConquer(double[] vals, int start, int end)
    {
        this.vals = vals;
        this.start = start;
        this.end = end;
    }
    
    @Override
    protected void compute() {
        if( end-start < treshold)
        {
            //compute
            System.out.println("Compute start "+start + " end "+end);
            for (int i = start; i < end; i++) {
                this.vals[i] *=2;
            }
        }
        else//divide
        {
            System.out.println("Divide ");
            int middle = (start+end)/2;
            invokeAll(
                    new SquareDivideConquer(vals, start, middle),
                    new SquareDivideConquer(vals, middle+1, end)
                    );
        }
    }
}
public class ForkJoinDemo {
    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool();
        Random random = new Random();
        double arr []  = new double [300];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100);
        }
        
        SquareDivideConquer task = new SquareDivideConquer(arr,0, arr.length);
        pool.invoke(task);
        
         for (int i = 0; i < arr.length; i++) {
             System.out.println("Arr "+arr[i]);
        }
        
    }
}
