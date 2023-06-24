/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava;

import java.util.Arrays;

/**
 *
 * @author swarn_7fnn1li
 */
public class selectionsort {
    public static void main(String[] args){
        int arr[]={1,3,0,4,2};
        cyclic(arr);
        System.out.print(Arrays.toString(arr));
    }
    static void sort(int[]arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-1-i;
            int maxindex=getmax(arr,0,last);
            swap(arr,maxindex,last);
            
            
        }
    }
    static int getmax(int[] arr,int start,int end){
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
        
    }
    static void swap(int[] arr,int i1,int i2){
        
            
            int t=arr[i1];
            arr[i1]=arr[i2];
            arr[i2]=t;
            
        }
    static void insertion(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j-1]>arr[j]){
                    swap(arr,j-1,j);
                }
                else{
                    break;
                }
            }
        }
    }
    static void cyclic(int[] arr){
        int i=0;
        while(i<arr.length){
            int correctindex=arr[i];
            if(arr[i]!=arr[correctindex]){
                swap(arr,i,correctindex);
            }else{
                i++;
            }
        }
        
    }
    
    
}
