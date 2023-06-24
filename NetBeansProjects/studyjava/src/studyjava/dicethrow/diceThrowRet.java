/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.dicethrow;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class diceThrowRet {
    public static void main(String[] args)
    {
        List<String> list=diceRet("",4);
        System.out.print(list);
        
    }
    static ArrayList<String> diceRet(String p, int target)
    {
        if(target==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++)
        {
            ans.addAll(diceRet(p+i,target-i));
            
        }
        return ans;
    }
    
}
