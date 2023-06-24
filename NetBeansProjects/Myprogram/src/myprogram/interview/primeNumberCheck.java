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
public class primeNumberCheck {
    public static void main(String[] args)
    {
        System.out.println(isPrime(5));
        System.out.println(isPrime(4));
    }
    static boolean isPrime(int n)
    {
        if(n == 0 ||  n == 1)
             return false;
        if(n==2)
             return true;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i == 0)
                 return false;
        }
        return true;
        
    }
            
}
