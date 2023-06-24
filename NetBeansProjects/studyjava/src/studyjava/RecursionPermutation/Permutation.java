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
public class Permutation {
    public static void main(String[] args)
    {
        permutations("","abc");
        
    }
    static void permutations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++)
        {
             String first=p.substring(0,i);
             String second=p.substring(i,p.length());
             permutations(first+ch+second,up.substring(1));
             
            
        }
       
    }
    
}
