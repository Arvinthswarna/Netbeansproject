/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.Recursionsubseq;

/**
 *
 * @author swarn_7fnn1li
 * 
 */
import java.util.*;
public class RecursionsubseqReturn {
    public static void main(String[] args)
    {
        System.out.print(subseq("","abc"));
    }
    static ArrayList<String> subseq(String p , String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseq(p+ch,up.substring(1));
        ArrayList<String> right = subseq(p,up.substring(1));
        left.addAll(right);
        return left;
    }
    
    
    
    
}
