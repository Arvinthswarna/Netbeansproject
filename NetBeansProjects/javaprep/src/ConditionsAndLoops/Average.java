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
public class Average {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            int num = s.nextInt();
            sum+=num;
        }
        System.out.println(sum/n);
    }
    
}
