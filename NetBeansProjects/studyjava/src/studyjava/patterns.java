/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
package studyjava;

/**
 *
 * @author swarn_7fnn1li
 */
public class patterns {
    public static void main(String[] args){
        
        pat8(5);
             
    }
    static void pat34(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i;j++){
         int al=64+n-j-i;
         System.out.print((char)al);
        }
        System.out.println();
    }
    
    }
        static void pat33(int n){
        ArrayList<Character> li=new ArrayList<>();
        for(int i=65;i<=90;i++){
            if(i%2==0)
            {
                li.add((char)i);
            }
            else
            {
                char c=(char)i;
                li.add(Character.toLowerCase(c));
            }
        }
        System.out.print(li);
        int ind=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(li.get(ind%26)+" ");
                ind++;
            }
            System.out.println();
        }
    }
    static void pat2(int n){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat3(int n){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=n+1-i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat4(int n){
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pat5(int n){
        for(int i=1;i<=2*n-1;i++)
        {
            int tot=i>n?2*n-i:i;
            for(int j=1;j<=tot;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pat6(int n){
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=n-i;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void pat7(int n){
        for(int i=1;i<=n;i++)
        {
            for(int s=1;s<=i-1;s++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
     static void pat20(int n){
        for(int i=0;i<n;i++)
        {
            
            for(int j=0;j<n-1;j++)
            {
                if(i==0 || i==n-1)
                {
                    System.out.print("*");
                }else
                {
                    if(j==0 || j==n-2)
                    {
                        System.out.print("*");
                    }
                    else
                    {
                        System.out.print(" ");
                    }
                }
                
            }
            System.out.println();
        }
    }
     static void pat31(int n){
        for(int i=1;i<=2*n-1;i++)
        {
            for(int j=1;j<=2*n-1;j++)
            {
                int min=n-Math.min(Math.min(i-1, j-1),Math.min(2*n-i-1, 2*n-j-1));
                System.out.print(min);
            }
            System.out.println();
            
        }
    }
     static void pat18(int num){
         int n=2*num;
         int star=0;
         for(int i=0;i<2*n;i++)
         {
             if(i>=n) break;
             
             if(i==num) continue;
             if(i<num) star=num-i;
             else star=i-4;
             for(int j=0;j<star;j++)
             {
                 System.out.print("*");
             }
             int space=n-2*star;
             for(int s=0;s<space;s++)
             {
                 System.out.print(" ");
             }
             for(int t=0;t<star;t++)
             {
                 System.out.print("*");
             }
             System.out.println();
             
             
         }
         
     }
     static void pat19(int num){
         int star=0;
         int space=0;
         for(int i=0;i<2*num;i++)
         {
             
             if(i<num) star=i+1;
             else star=2*num-i-1;
             for(int j=0;j<star;j++)
             {
                 System.out.print("*");
             }
             space=2*num-2*star;
             for(int s=0;s<space;s++)
             {
                 System.out.print(" ");
             }
             for(int t=0;t<star;t++)
             {
                 System.out.print("*");
             }
             System.out.println();
        }
    }
     
    static void pat26(int num){
        for(int i=0;i<=num;i++)
        {
            for(int j=0;j<=num-i;j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
    }
    static void pat21(int num){
        int t=0;
        for(int i=0;i<num;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(++t+" ");
                
            }
            System.out.println();
        }
    }
    static void pat8(int num){
        int star=0;
        int space=0;
        for(int i=0;i<num;i++)
        {
            
            space=num-i;
            for(int s=0;s<space;s++)
            {
                System.out.print(" ");
            }
            star=i+1;
            for(int j=0;j<star;j++)
            {
                
                System.out.print("*");
            }
            for(int j=0;j<star;j++)
            {
                
                System.out.print("*");
            }
            System.out.println();
        }
    }
     
    
        
    
    

    
}
