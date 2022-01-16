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
public class IntegerStack {
    int[]data;
    int size = 20;
    
    int top = -1;
    IntegerStack()
    {
        this.data = new int[size];
    }
    
    void push(int item)
    {
        this.data[++top] = item;
    }
    int pop()
    {
        return this.data[top--];
    }
    
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();
        stack.push(10);
        stack.push(20);
        
        System.out.println("Pop "+stack.pop());
    }
}
