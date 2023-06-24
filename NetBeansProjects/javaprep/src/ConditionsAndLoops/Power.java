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
public class Power {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double base = s.nextDouble();
        double exp = s.nextDouble();
        int res = 1;
        while(exp!=0)
        {
            res*=base;
            exp--;
        }
        System.out.println(res);
    }
    
}
