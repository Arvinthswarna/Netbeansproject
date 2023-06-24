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
public class Armstrong {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int sum=0;
        while(temp != 0)
        {
            int rem = temp%10;
            temp = temp/10;
            sum+=rem*rem*rem;
            
        }
        if(n == sum)
            System.out.println("Armstrong number");
        else
            System.out.println("Not a Armstrong number");
    }
    
}
