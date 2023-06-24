/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionsAndLoops;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class SumTillZero {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int sum=0;
        while(true)
        {
           int n = s.nextInt();
           if(n!=0)
               sum+=n;
           else
               break;
        }
        System.out.println(sum);
    }
    
}
