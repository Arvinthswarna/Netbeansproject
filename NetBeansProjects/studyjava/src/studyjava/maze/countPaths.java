/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.maze;

/**
 *
 * @author swarn_7fnn1li
 */
public class countPaths {
    public static void main(String[] args)
    {
        System.out.print(count(3,3));
    }
    static int count(int r , int c)
    {
        if(r ==1 || c == 1)
        {
            return 1;
        }
        int left = count(r-1,c);
        int right = count(r,c-1);
        return left+right;
    }
    
}
