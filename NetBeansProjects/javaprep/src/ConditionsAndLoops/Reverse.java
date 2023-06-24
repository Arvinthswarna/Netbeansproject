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
public class Reverse {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int rev=0;
        while(temp != 0)
        {
            int rem = temp%10;
            temp = temp/10;
            rev=rev*10+rem;
            
        }
        System.out.println("Reversed number :"+rev);
    }
    
}
