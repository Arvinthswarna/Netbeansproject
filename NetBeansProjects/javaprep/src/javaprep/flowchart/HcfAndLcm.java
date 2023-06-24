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
//LCM (Least Common Multiple): The LCM of two numbers is the smallest positive integer which is divisible by both numbers.
//HCF (Highest common Factor): HCF of two numbers is the largest positive integer that divides both the numbers.
import java.util.*;
public class HcfAndLcm {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int hcf;
        
        if(a<b)
        {
            hcf = a;
        }
        else
            hcf =b;
        while(true){
        if((a%hcf == 0) && ( b%hcf == 0))
            break;
        else
            hcf--;
        }
        int lcm = (a*b)/hcf;
        System.out.println(lcm);
    }
    
}
