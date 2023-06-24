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
public class countzeroes {
    public static void main(String[] args)
    {
        int n=30402;
        System.out.print(count(n));
    }
    static int count(int n)
    {
        return help(n,0);
    }
    static int help(int n,int c)
    {
        if(n==0) return c;
        else
        {
            int rem=n%10;
            if(rem==0) return help(n/10,c+1);
            else return help(n/10,c);
        }
    }
     
}
