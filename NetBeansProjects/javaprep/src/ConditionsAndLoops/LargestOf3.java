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
public class LargestOf3 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        /*int max = a;
        if(b>max)
        {
           max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println(max+" is maximum");*/
        
        //Another method 2
        
        /*int max=0;
        if(a>max)
        {
            max=a;
        }
        else
        {
            max=b;
        }
        if(c>max)
        {
            max=c;
        }
        System.out.println(max+" is maximum");*/
        
        
        // method 3
        
        int max =Math.max(c,(Math.max(a,b)));
        System.out.println(max+" is maximum");
        
    }
    
}
