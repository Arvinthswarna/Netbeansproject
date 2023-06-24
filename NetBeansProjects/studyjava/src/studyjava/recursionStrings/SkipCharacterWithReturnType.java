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
public class SkipCharacterWithReturnType {
    public static void main(String[] args)
    {
        System.out.print(skip("baccas"));
    }
    static String skip(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a')
        {
            return skip(up.substring(1));
        }
        else
        {
            return ch+skip(up.substring(1));
        }
    }
    
}
