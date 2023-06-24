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
public class factorial {
    public static void main(String[] args)
    {
        System.out.print(fact(5));
    }
    static int fact(int n)
    {
        if(n<2) return n;
        else return n*fact(n-1);
        
    }
    
}
