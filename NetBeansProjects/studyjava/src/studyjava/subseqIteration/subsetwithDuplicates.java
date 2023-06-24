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
public class subsetwithDuplicates {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,2};
        List<List<Integer>> ans = subsetdup(arr);
        for(List<Integer> list : ans)
        {
            System.out.print(list);
            
        }
        
    }
    static List<List<Integer>> subsetdup(int[] arr)
    {
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>());
        int start=0,end=0;
        for(int i=0;i<arr.length;i++)
        {
            start=0;
            if(i>0 && arr[i]==arr[i-1])
            {
                start=end+1;
            }
            end=outer.size()-1;
            int n=outer.size();
            for(int j=0;j<n;j++)
            {
                List<Integer> internal = new ArrayList<>(outer.get(j));
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        return outer;
        
    }
    
}
