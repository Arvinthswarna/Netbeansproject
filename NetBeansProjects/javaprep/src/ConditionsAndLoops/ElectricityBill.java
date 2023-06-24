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
public class ElectricityBill {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int unit = s.nextInt();
        if(unit <= 100)
            System.out.println(unit*10);
        else if (unit <= 200)
            System.out.println((100*10)+(unit-100)*15);
        else if(unit <= 300)
            System.out.println((100*10)+(100*15)+(unit-200)*20);
        else if(unit > 300)
            System.out.println((100*10)+(100*15)+(100*20)+(unit-300)*25);
        
            
    }
    
}
