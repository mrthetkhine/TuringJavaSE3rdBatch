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
public class GenericStack<T> {
    
    T[]data;
    int size = 20;
    
    int top = -1;
    
    GenericStack()
    {
        this.data =  (T[])new Object[size];
    }
    public void push(T element)
    {
        this.data[++top] = element;
    }
    public T pop()
    {
        return this.data[top--];
    }
    
    public static void main(String[] args) {
        GenericStack<Integer> stack  =new  GenericStack<Integer>();
        stack.push(4);
        stack.push(5);
        
        System.out.println("Pop "+stack.pop());
        
        GenericStack<String> stringStack  =new  GenericStack<String>();
        stringStack.push("Hello");
        System.out.println("Pop "+stringStack.pop());
    }
}
