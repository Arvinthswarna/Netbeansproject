/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.Recursionsubseq;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class LongestSubstring {
    public static void main(String[] args)
    {
      
        String s = "abcabbc";
        System.out.println(substring(s));
    }
    static int substring(String s)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            ArrayList<Character> li = new ArrayList<>();
            for(int j=i;j<s.length();j++)
            {
                if(li.contains(s.charAt(j)))
                    break;
                li.add(s.charAt(j));
                
            }
            list.add(li.size());
        }
        return Collections.max(list);
       
       
    }
    
}
