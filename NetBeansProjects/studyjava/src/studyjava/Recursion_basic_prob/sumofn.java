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
public class sumofn {
    public static void main(String[] args)
    {
        System.out.print(sum(5));
    }
    static int sum(int n)
    {
       if(n<1) return n;
       else return n+sum(n-1);
    }
}
