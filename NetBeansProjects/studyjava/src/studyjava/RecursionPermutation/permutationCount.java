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
public class permutationCount {
    public static void main(String[] args)
    {
        System.out.print(permutations("","abc "));
        
    }
    static int permutations(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++)
        {
             String first=p.substring(0,i);
             String second=p.substring(i,p.length());
             count=count+permutations(first+ch+second,up.substring(1));
             
            
        }
        return count;
       
    }
    
}
