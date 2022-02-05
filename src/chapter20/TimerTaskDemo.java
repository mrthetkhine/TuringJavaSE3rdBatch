/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author thetkhine
 */
class Task extends TimerTask
{

    @Override
    public void run() {
        System.out.println("Running "+new Date());
    }
    
}
public class TimerTaskDemo {
    public static void main(String[] args) {
        Task task = new Task();
        Timer timer = new Timer();
        timer.schedule(task, 1000,1000);
    }
}
