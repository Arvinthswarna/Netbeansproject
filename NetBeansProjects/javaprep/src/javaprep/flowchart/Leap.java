/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprep.flowchart;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class Leap {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0))
            System.out.println("leap year");
        else 
            System.out.println("not a leap year");
            
    }
    }
    
}
