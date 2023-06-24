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
import java.util.*;
public class reversenum {
    public static void main(String[] args)
    {
        
        System.out.print(rev(56894));
    }
    
    static int rev(int n)
    {
        int digits=(int)(Math.log10(n))+1;
        return helper(n,digits);
    }
    static int helper(int n,int digits)
    {
       
        if(n%10==0) return n;
         int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    
}
