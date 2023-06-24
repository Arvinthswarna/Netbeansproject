/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.Recursion_basic_prob;

/**
 *
 * @author swarn_7fnn1li
 */
public class ProductOfDigits {
    public static void main(String[] args)
    {
        System.out.print(ProductDigit(345));
    }
    static int ProductDigit(int n)
    {
        if(n%10==n) return n;
        else return (n%10)*ProductDigit(n/10);
        
    }
    
}
