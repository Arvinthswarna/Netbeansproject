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
public class ConditionBasedSum {
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
       int ele=0,esum=0,osum=0,nsum=0;
       ArrayList arr = new ArrayList<>();
       do
       {
           ele = s.nextInt();
           if(ele % 2  == 0 && ele>-1)
               esum+=ele;
           else if(ele % 2 !=0 && ele> -1)
               osum+=ele;
           else
               nsum+=ele;
           arr.add(ele);
           
       }while(ele !=0);
       
       System.out.println("sum of positive even sum"+esum);
       System.out.println("sum of positive odd sum"+osum);
       System.out.println("sum of negative sum"+nsum);
       
       
       
    }
}
        
