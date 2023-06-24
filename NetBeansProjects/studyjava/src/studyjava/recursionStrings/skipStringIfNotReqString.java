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
public class skipStringIfNotReqString {
    public static void main(String[] args)
    {
        System.out.print(skipAppNotApple("swaappltham"));
    }
    static String skipAppNotApple(String up)
    {
        if(up.isEmpty())
        {
            return "";
        }
        char ch=up.charAt(0);
        if(up.startsWith("app") && !up.startsWith("apple"))
        {
            return skipAppNotApple(up.substring(3));
        }
        else
        {
            return ch+skipAppNotApple(up.substring(1));
        }
        
    }
    
}
