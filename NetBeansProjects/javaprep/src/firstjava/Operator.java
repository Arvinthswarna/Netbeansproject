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
public class Operator {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        String op = s.next();
        if(op.equals("+"))
            System.out.println(a+b);
        else if(op.equals("-"))
            System.out.println(a-b);
        else if(op.equals("*"))
            System.out.println(a*b);
        else if(op.equals("/"))
            System.out.println(a/b);
        else
            System.out.println("invalid input");
    }
    
}
