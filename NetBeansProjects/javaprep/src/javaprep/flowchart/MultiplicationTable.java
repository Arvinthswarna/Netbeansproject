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
public class MultiplicationTable {
    public static void main(String[] args)
    {
        System.out.print("Enter a number for table: ");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for(int i=1;i<=20;i++)
        {
            System.out.println(n+"*"+i+"="+n*i);
        }
        
        
    }
    
}
