/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjava;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class Fibonacci {
    public static void main(String[] args)
    {
        
        // fibonacci number series
        /* Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0,b=1,c;
        
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        */
            
            //nth fibonacci number
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a=0,b=1,c=0;
        for(int i=2;i<=n;i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        System.out.print(c+" ");
    }
    
}
