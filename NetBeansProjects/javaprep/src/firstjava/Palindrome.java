/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjava;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class Palindrome {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String t = s.nextLine();
        String rev="";
        for(int i=t.length()-1;i>=0;i--)
        {
            rev=rev+t.charAt(i);
        }
        if(t.equals(rev))
            System.out.print("palindrome");
        else
            System.out.print("Not a palindrome");
            
        
    }
    
    
}
