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
public class PerfectNumber {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum = 0;
        for(int i=1;i<n;i++)
        {
            if(n%i == 0)
                sum+=i;
        }
        if(sum == n)
            System.out.println("perfect number");
        else
            System.out.println("Not a perfect number");
    }
    
}
