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
public class printPath {
    public static void main(String[] args)
    {
        path("",3,3);
    }
    static void path(String p, int r , int c)
    {
        if(r == 1 && c == 1)
        {
            System.out.println(p);
            return;
        }
        if(r > 1)
        {
            path(p+'D',r-1,c);
        }
        if(c > 1)
        {
            path(p+'R',r,c-1);
        }
    }
    
}
