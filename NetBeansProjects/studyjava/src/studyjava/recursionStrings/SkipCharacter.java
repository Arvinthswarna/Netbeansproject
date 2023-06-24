/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.recursionStrings;

/**
 *
 * @author swarn_7fnn1li
 */
public class SkipCharacter {
    public static void main(String[] args)
    {
        skip("","baccas");
    }
    static void skip(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.print(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            skip(p,up.substring(1));
        }
        else
        {
            skip(p+ch,up.substring(1));
        }
        
    }
    
}
