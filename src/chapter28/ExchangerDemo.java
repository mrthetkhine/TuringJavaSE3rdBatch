/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter28;

import java.util.concurrent.Exchanger;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
class StringMaker extends Thread
{
    Exchanger<String> exchanger;
    String str;
    
    StringMaker(Exchanger<String> exchanger)
    {
        this.exchanger = exchanger;
        this.str = new String();
    }
    public void run()
    {
        char ch = 'A';
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                str= ch++ +"";
                
                try {
                    String otherStr = exchanger.exchange(str);
                    System.out.println("Other Str "+ otherStr);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
}
class StringUser extends Thread
{
    Exchanger<String> exchanger;
    String str;
    StringUser(Exchanger<String> exchanger)
    {
        this.exchanger = exchanger;
    }
    public void run()
    {
        
        for (int i = 0; i < 15; i++) {
            try {
                str = exchanger.exchange(new String(i+""));
                System.out.println("User got "+str);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }
}
public class ExchangerDemo {
    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<String>();
        
        StringMaker maker = new StringMaker(exchanger);
        StringUser user = new StringUser(exchanger);
        
        maker.start();
        user.start();
    }
}
