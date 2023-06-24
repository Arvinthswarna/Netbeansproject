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
public class Calculator {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int ans=0;
       
        
        while(true){
            System.out.println("Enter the operator");
            String op = s.next();
            if(op .equals("+")|| op.equals("-")|| op.equals("*") || op.equals("/")|| op.equals("%"))
            {
                System.out.println("Enter two numbers");
                int a = s.nextInt();
                int b = s.nextInt();
                if(op.equals("+"))
                    ans=a+b;
                if(op.equals("-"))
                    ans=a-b;
                if(op.equals("*"))
                    ans=a*b;
                if(op.equals("/"))
                    ans=a/b;
                if(op.equals("%"))
                    ans=a%b;
            }
            else if(op.equals("x") || op.equals("X"))
                   break;
            else
                System.out.println("Invalid Input");
           System.out.println(ans); 
            
                    
        }
        
            
    }
    
}
