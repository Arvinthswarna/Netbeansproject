/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.SortingUsingRecursion;

import java.util.Arrays;

/**
 *
 * @author swarn_7fnn1li
 */
public class MergeSort {
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        int[] ans=mergesort(arr);
        System.out.print(Arrays.toString(ans));
    }
    static int[] mergesort(int[] arr)
    {
        if(arr.length==1) return arr;
        int mid=arr.length/2;
        int[] left=mergesort(Arrays.copyOfRange(arr,0,mid));
        int[] right=mergesort(Arrays.copyOfRange(arr,mid,arr.length));
        return merge(left,right);
        
    }
    private static int[] merge(int[] first,int[] second)
    {
        int i=0;
        int j=0;
        int k=0;
        int[] mix=new int[first.length+second.length];
        while(i<first.length && j<second.length)
        {
            if(first[i]<second[j])
            {
                mix[k]=first[i];
                i++;
            }
            else
            {
                mix[k]=second[j];
                j++;
            }
            k++;
           
        }
         while(i<first.length)
            {
                mix[k]=first[i];
                i++;
                k++;
            }
            while(j<second.length)
            {
                mix[k]=second[j];
                j++;
                k++;
            }
        return mix;
    }
    
}
