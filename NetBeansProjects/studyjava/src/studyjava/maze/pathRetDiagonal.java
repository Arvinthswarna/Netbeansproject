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
import java.util.*;
public class pathRetDiagonal {
    public static void main(String[] args)
    {
        ArrayList<String> list = pathRetDia("",3,3);  
        System.out.print(list);                        //Both are same       
        //System.out.print(pathRetDia("",3,3));
    }
    static ArrayList<String> pathRetDia(String p , int r , int c)
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r> 1 && c > 1)
        {
            ans.addAll(pathRetDia(p+'D',r-1,c-1));
        }
        if(r > 1)
        {
            ans.addAll(pathRetDia(p+'V',r-1,c));
        }
        if(c > 1)
        {
            ans.addAll(pathRetDia(p+'H',r,c-1));
            
        }
        return ans;
    }
    
}
