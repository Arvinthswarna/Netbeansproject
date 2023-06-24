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
public class swapWithoutthirdVar {
    public static void main(String[] args)
    {
        int a=10;
        int b=20;
        System.out.print("Before swap a="+ a+ "and b="+b);
         a=a+b;
         b=a-b;
         a=a-b;
         System.out.print("After swap a="+ a+ "and b="+b);
        
    }
    
}
