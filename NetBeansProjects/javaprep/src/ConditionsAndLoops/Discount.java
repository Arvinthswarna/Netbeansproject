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
public class Discount {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int price = s.nextInt();
        int dis = s.nextInt();
        int disrate = price*dis/100;
        int amt=price-disrate;
        System.out.println(amt);
        
    }
    
}
