/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class CustomStack {
    protected int[] data;
    private static final int size=10;
    int ptr=-1;
    
    
    
    CustomStack(int size)
    {
        data=new int[size];
    }
    
    public boolean isFull()
    {
        return ptr == data.length-1;
    }
    
    public boolean isEmpty()
    {
        return ptr == -1;
    }
    
    public boolean push(int item)
    {
        if(isFull())
        {
            System.out.println("stack is full");
            return false;
        }
        ptr++;
        data[ptr]=item;
        return true;
    }
    
    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        return data[ptr--];
    }
    
    public int peek(int item)
    {
        if(isEmpty())
        {
            System.out.println("stack is empty");
            return -1;
        }
        return data[ptr];
    }
    public void print()
    {
        for(int i=0;i<=ptr;i++)
        {
            System.out.println(data[i]);
        }
    }
    public static void main(String[] args)
    {
        CustomStack stack = new CustomStack(5);
        stack.push(6);
        stack.push(16);
        stack.push(63);
        stack.push(62);
        stack.push(68);
        System.out.println("Stack Before popping");
        stack.print();
        System.out.println("popped elements");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(" Stack After popping");
        stack.print();
    }
    
    
}
