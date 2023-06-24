/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjava;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class LargestOfTwoNos {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        if(a>b)
            System.out.println(a+" is big");
        else
            System.out.println(b+" is big");
    }
    
}
