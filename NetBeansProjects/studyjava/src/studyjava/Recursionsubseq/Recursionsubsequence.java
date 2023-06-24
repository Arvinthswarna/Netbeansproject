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
public class Recursionsubsequence {
    public static void main(String[] args)
    {
        subseq("","abc");
    }
    static void subseq(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch,up.substring(1));
        subseq(p,up.substring(1));
    }
    
}
