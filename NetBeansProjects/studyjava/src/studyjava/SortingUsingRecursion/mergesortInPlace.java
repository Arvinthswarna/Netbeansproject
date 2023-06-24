/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package studyjava.SortingUsingRecursion;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class mergesortInPlace {
    public static void main(String[] args)
    {
        int[] arr={5,4,3,2,1};
        mergeSortInPlace(arr,0,arr.length);
        System.out.print(Arrays.toString(arr));
    }
    static void mergeSortInPlace(int[] arr,int s,int e)
    {
        if(e-s==1) return;
        int mid=(s+e)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);
        merge(arr,s,mid,e);
        
        
    }
    private static void merge(int[] arr,int s,int m,int e)
    {
        int i=s;
        int j=m;
        int k=0;
        int[] mix=new int[e-s];
        while(i<m && j<e)
        {
            if(arr[i]<arr[j])
            {
                mix[k]=arr[i];
                i++;
            }
            else
            {
                mix[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<m)
        {
            mix[k]=arr[i];
            i++;
            k++;
        }
        while(j<e)
        {
            mix[k]=arr[j];
            j++;
            k++;
        }
        for(int l=0;l<mix.length;l++)
        {
            arr[s+l]=mix[l];
        }
        
    }
    
}
