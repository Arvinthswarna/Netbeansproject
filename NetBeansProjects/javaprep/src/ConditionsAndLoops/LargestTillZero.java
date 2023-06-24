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
public class LargestTillZero {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int max=0,n=0;
        
        do
        {
             n =s.nextInt();
              if(n>max)
                    max=n;
            
        }while(n!=0);
        System.out.println(max);
        
    }
    
}
