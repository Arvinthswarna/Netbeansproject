/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.BackTracking;

/**
 *
 * @author swarn_7fnn1li
 */
public class allPaths {
    public static void main(String[] args)
    {
        boolean [][] maze = {{true , true , true },
                             { true , true , true},
                             {true , true , true}
        };
        allPath("",maze,0,0);
    }
    static void allPath(String p , boolean[][] maze , int r , int c)
    {
        if(r == maze.length-1  && c == maze[0].length-1)
        {
            System.out.println(p);
            return ;
        }
        if(maze[r][c] == false)
        {
            return;
        }
        maze[r][c]=false;
         if(r < maze.length-1)
         {
             allPath(p+'D',maze,r+1,c);
         }
         
         if(c < maze[0].length-1)
         {
             allPath(p+'R',maze,r,c+1);
         }
         
         if(r > 0)
         {
             allPath(p+'U',maze,r-1,c);
         }
         
         if(c > 0)
         {
             allPath(p+'L',maze,r,c-1);
             
         }
         maze [r][c] = true;
            
    }
            
            
    
}
