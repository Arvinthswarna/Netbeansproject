/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionsAndLoops;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class VowelConsonant {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        char ch = s.next().trim().charAt(0);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("vowel");
        else
            System.out.println("consonant");
    }
    
}
