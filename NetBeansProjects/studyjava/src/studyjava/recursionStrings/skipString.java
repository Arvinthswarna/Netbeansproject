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
public class skipString {
    public static void main(String[] args)
    {
        System.out.print(skipApple("swaappletham"));
       
    }
    static String skipApple(String up)
    {
        
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("apple"))
        {
            return skipApple(up.substring(5));
        }
        else
        {
            return ch+skipApple(up.substring(1));
        }
    }
    
}
