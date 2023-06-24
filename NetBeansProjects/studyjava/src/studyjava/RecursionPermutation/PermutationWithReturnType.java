/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.RecursionPermutation;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class PermutationWithReturnType {
    public static void main(String[] args)
    {
        List<String> ans=permutations("","abc");
        System.out.print(ans);
        
    }
    static List<String> permutations(String p , String up)
    {
        if(up.isEmpty())
        {
            List<String> list= new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        List<String> ans= new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            ans.addAll(permutations(first+ch+second,up.substring(1)));
            
        }
        return ans;
    }
    
}
