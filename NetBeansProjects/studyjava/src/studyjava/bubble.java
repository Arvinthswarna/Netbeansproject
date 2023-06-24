/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class bubble {
    public static void main(String[] args){
        int arr[]={4,9,2,1,3};
        bubblesort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
    static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            boolean swapped=false;
            for(int j=1;j<arr.length-i;j++){
                if(arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                
                swapped=true;
                }
            }
                
            if(!swapped){
                break;
            }
        }
    }
    static void swap(int[] arr,int i1,int i2){
        
           
            int t=arr[i1];
            arr[i1]=arr[i2];
            arr[i2]=t;
                    
            
        }
    
    
    
   }
 
