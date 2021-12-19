/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter6;

/**
 *
 * @author thetkhine
 */
public class Stack {
    private int data[];
    private int top;
    
    private static final int DEFAULT_SIZE = 10;
    
    Stack()
    {
        this.data = new int[DEFAULT_SIZE];
        this.top = -1;
    }
   
    
    public Stack(int size)
    {
        if(size < 1)
        {
            System.out.println("Negative size not allowed size default to 10");
            size = DEFAULT_SIZE;
        }
        this.data = new int[size];
        this.top = -1;
    }
    
    public void push(int element)
    {
        if(top == this.data.length-1)
        {
            System.out.println("Stack overflow");
        }
        else
        {
            ++ this.top;
            this.data[top] = element;
        }
        
    }
    public int pop()
    {
        if(this.top < 0)
        {
            System.out.println("Stack underflow");
            return 0;
        }
        else
        {
            return this.data[this.top--];
        }
        
    }
    
    public static void main(String[] args) {
        Stack s1 = new Stack();
        
        //s1.data  = new int[100];
        
        for (int i = 0; i < 5; i++) {
            s1.push(i);
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("s1.pop "+s1.pop());
        }
    }
}
