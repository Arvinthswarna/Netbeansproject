/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava;

/**
 *
 * @author swarn_7fnn1li
 */
public class freqOfChar {
    public static void main(String[] args)
    {
        frequency("aaabbc");
    }
    static void frequency(String s)
    {
        int[] freq = new int[256];
        for(int i=0;i<s.length();i++)
        {
            freq[(int) s.charAt(i)]++;
        }
        
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]!=0)
                System.out.print((char)i+""+freq[i]);
        }
        
    }
    
}
