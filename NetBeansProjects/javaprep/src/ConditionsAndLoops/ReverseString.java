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
public class ReverseString {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        StringBuilder str = new StringBuilder(t);
        str.reverse();
        System.out.println(str);
       
       //method 2
       /*String rev="";
       for(int i=t.length()-1;i>=0;i--)
       {
           rev=rev+t.charAt(i);
           
       }
       System.out.println(rev);
      */
    }
    
}
