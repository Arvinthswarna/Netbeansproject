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
public class CompoundIntrest {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double p = s.nextDouble();
        double r = s.nextDouble();
        double t = s.nextDouble();
        
        double res=0;
        res = p*Math.pow((1+r/100),t);
        System.out.println(res);
    }
    
}
