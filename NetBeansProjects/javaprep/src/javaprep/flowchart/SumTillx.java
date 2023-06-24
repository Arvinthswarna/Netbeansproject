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
public class SumTillx {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int sum=0;
        while(true){
            String  n = s.nextLine();
            if(n.equals("X"))
                break;
           
                int num = Integer.parseInt(n);
                sum+=num;
        }
        System.out.println(sum);
    }
}
