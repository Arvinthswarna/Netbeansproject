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
import java.util.ArrayList;
public class printpathRet {
    public static void main(String[] args)
    {
        ArrayList<String> list=pathRet("",3,3);
        System.out.print(list);
    }
    static ArrayList<String> pathRet(String p , int r , int c )
    {
        if(r == 1 && c == 1)
        {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r > 1)
        {
            ans.addAll(pathRet(p+'D',r-1,c));
            
        }
        if(c > 1)
        {
            ans.addAll(pathRet(p+'R',r,c-1));
        }
        return ans;
    }
    
}
