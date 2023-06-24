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
public class BattingAverage {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int runs = s.nextInt();
        int matches = s.nextInt();
        int notout = s.nextInt();
        
        int out = matches - notout;
        
        if(out == 0)
            System.out.println("-1");
        else 
        {
            int avg = runs/out;

            if(avg == -1)
                System.out.println("NA");
            System.out.println(avg);
        }
    }
    
}
