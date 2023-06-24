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
public class diceFaceRet {
    public static void main(String[] args)
    {
        ArrayList<String> list = dicefaceret("",3,5);
        System.out.print(list);
    }
    static ArrayList<String> dicefaceret(String p, int target,int face)
    {
        if(target==0)
        {
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans= new ArrayList<>();
        for(int i=1;i<=face && i<=target;i++)
        {
            ans.addAll(dicefaceret(p+i,target-i,face));
        }
        return ans;
    }
    
}
