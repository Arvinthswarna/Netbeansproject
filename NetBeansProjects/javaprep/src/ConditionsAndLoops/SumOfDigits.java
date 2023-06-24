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
public class SumOfDigits {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n,sum=0;
        while(temp != 0)
        {
            int rem = temp%10;
            temp = temp/10;
            sum+=rem;
        }
        System.out.println(sum);
    }
    
}
