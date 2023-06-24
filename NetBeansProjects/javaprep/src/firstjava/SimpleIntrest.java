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
public class SimpleIntrest {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int p = s.nextInt();
        int n = s.nextInt();
        int r = s.nextInt();
        float si = (p*n*r)/100;
        System.out.println("Simple Intrest: "+si);
    }
    
}
