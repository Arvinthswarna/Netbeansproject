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
public class CommissionPercentage {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double comrate = s.nextInt();
        double amt = s.nextInt();
        double res = (comrate/100)*amt;
        System.out.println(res);
    }
    
}
