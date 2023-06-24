/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.subseqIteration;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class subset {
    public static void main(String[] args)
    {
        int[] arr={1,2,3};
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list:ans)
        {
            System.out.print(list);
        }
        
    }
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num:arr)
        {
            int n=outer.size();
            for(int i=0;i<n;i++)
            {
                List<Integer> internal=new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
        
    }
    
}
