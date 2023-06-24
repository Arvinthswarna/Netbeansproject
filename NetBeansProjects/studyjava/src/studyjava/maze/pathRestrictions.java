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
public class pathRestrictions {
    public static void main(String[] args)
    {
        boolean[][] maze={{true , true , true },
                          {true , false , true },
                          {true , true , true }
        
        };
        pathRestrict("",maze,0,0);
                
    }
    static void pathRestrict(String p , boolean[][] maze , int r , int c)
    {
        if(r == maze.length-1 && c == maze[0].length-1)
        {
            System.out.println(p);
            return;
        }
        if(!maze[r][c])
        {
            return;
        }
        if(r < maze.length-1)
        {
            pathRestrict(p+'D',maze,r+1,c);
        }
        if(c < maze[0].length-1)
        {
            pathRestrict(p+'R',maze,r,c+1);
        }
    }
    
}
