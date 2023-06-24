/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package myprogram.interview;
import java.util.*;

/**
 *
 * @author swarn_7fnn1li
 */
public class stringRev {
    public static void  main(String[] args)
    {
        String s = "Hello";
        System.out.print(reverse(s));
    }
    static String reverse(String r)
    {
        StringBuilder out = new StringBuilder();
        char arr[]=r.toCharArray();
        for(int i=arr.length-1 ; i>=0; i--)
        {
            out.append(arr[i]);
        }
        return out.toString();
        
    }
    
}
