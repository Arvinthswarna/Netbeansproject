/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.subseqIteration;

/**
 *
 * @author swarn_7fnn1li
 */
public class subseq {
    public static void main(String[] args)
    {
       subSeq("","abc");
    }
    static void subSeq(String p , String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
            
        char ch = up.charAt(0);
        subSeq(p+ch,up.substring(1));
        subSeq(p,up.substring(1));
    }
    
}
