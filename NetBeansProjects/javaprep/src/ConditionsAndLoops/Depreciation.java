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
public class Depreciation {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        float val = s.nextInt();
        float t = s.nextInt();
        float r = s.nextInt();
        float res = (float)(val*Math.pow((1-r/100), t));
        System.out.println(res);
    }
    
}
