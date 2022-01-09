/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

/**
 *
 * @author thetkhine
 */
class GoToTripAction extends Thread
{
    public void run()
    {
        System.out.println("Now all friend reached to bus gate, can go trip now");
    }
}
class Friend extends Thread
{
    CyclicBarrier cbarrier;
    String name;
    Friend(CyclicBarrier cbarrier,String name)
    {
        this.cbarrier = cbarrier;
        this.name = name;
    }
    public void run()
    {
        System.out.println("Friend "+ name + " reach busgate");
        try
        {
            this.cbarrier.await();
        }
        catch(BrokenBarrierException|InterruptedException ie)
        {
            ie.printStackTrace();
        }
    }
}
public class CyclicBarrierDemo {
    public static void main(String[] args) {
        CyclicBarrier cb = new CyclicBarrier(3,new GoToTripAction());
        
        Friend mgmg = new Friend(cb,"Mg Mg");
        Friend aungAung = new Friend(cb,"Aung Aung");
        Friend kyawKyaw = new Friend(cb,"Kyaw Kyaw");
        
        mgmg.start();
        aungAung.start();
        kyawKyaw.start();
    }
}
