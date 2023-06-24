/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myprogram.interview;

/**
 *
 * @author swarn_7fnn1li
 */
public class fibUsingRec {
   public static void main(String[] args)
   {
       int n = 5;
       for(int i = 0 ; i < n ; i++)
       {
           System.out.print(fib(i)+" ");
       }
        
   }
   static int fib(int n)
   {
       if(n == 0 || n == 1)
           return n;
       return fib(n-1)+fib(n-2);
       
   }
    
    
}
