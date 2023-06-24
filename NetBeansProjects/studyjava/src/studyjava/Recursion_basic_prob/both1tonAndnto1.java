/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.Recursion_basic_prob;

/**
 *
 * @author swarn_7fnn1li
 */
public class both1tonAndnto1 {
    public static void main(String[] args)
    {
        print(5);
    }
    static void print(int n)
    {
        if(n==0) return ;
        else 
        {
            System.out.print(n+" ");
            print(n-1);
            System.out.print(n+" ");
        }
    }
    
}
