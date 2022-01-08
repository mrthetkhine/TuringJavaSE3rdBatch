/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter8;

/**
 *
 * @author thetkhine
 */
abstract class Gateway{
    public abstract void processPayment();
    
    public final void method()
    {
        System.out.println("Final method");
    }
   
}
class KBZGateway extends Gateway{
  
    public void processPayment()
    {
        System.out.println("Pay with KBZ gateway");
    }
    /*
    public void method()
    {
        System.out.println("Final method");
    }
    */
    
}
class CBGateway extends Gateway{
    public void processPayment()
    {
        System.out.println("Pay with CB gateway");
    }
    
}
class YomaGateway extends Gateway{
    
    public void processPayment()
    {
        System.out.println("Pay with Yoma gateway");
    }
    
}
public class PolymorphismDemo {
    public static void main(String[] args) {
        
        
        Gateway gateway = new KBZGateway();
        //gateway = new Gateway();
        gateway.processPayment();
        /*
        if(gatewayName.equals("KBZ")
        {
            KBZGateway gateway = new KBZGateway();
            gateway.processPayment();
        }
        */
    }
}
