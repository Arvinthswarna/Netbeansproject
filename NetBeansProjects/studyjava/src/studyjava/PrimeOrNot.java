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
import java.util.*;
public class PrimeOrNot {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n =s.nextInt();
        boolean flag =true;
        int c=2;
        while(c*c <= n)
        {
            if(n%c == 0)
            {
                System.out.println("Not prime");
                flag=false;
                break;
            }
            else 
            {
                c++;
            }
            
        }
        if(flag)
           System.out.println("Prime");
        
        
    }
    
}
