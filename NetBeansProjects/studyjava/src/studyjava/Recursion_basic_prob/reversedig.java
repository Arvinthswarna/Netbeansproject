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
public class reversedig {
    static int rev2(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        if(n%10==n) return n;
         return helper(n,digits);
    }
    private static int helper(int n,int digits)
    {
        if(n%10==n)return n;
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
        
    }
    public static void main(String[] args)
    {
        int n=1824;
        int ans=rev2(n);
        System.out.print(ans);
        
        
    }
    
    
}
