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
public class sumOfDigits {
    public static void main(String[] args)
    {
        System.out.print(DigitSum(1234));
    }
    static int DigitSum(int n)
    {
        if(n%10==0) return n;
        else return (n%10)+DigitSum(n/10);
    }
    
}
