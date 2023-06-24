
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swarn_7fnn1li
 */
public class sorting {
    public static void main(String[] args){
        int arr[]={4,3,5,2,1};
        int arr0[]={4,3,0,2,1};
        bubble(arr);
        System.out.println("bubble sort"+Arrays.toString(arr));
        selection(arr);
        System.out.println("selection sort"+Arrays.toString(arr));
        insertion(arr);
        System.out.println("insertion sort"+Arrays.toString(arr));
        cyclic(arr0);
        System.out.println("cyclic sort(0 to n)"+Arrays.toString(arr0));
        cyclic1(arr);
        System.out.println("cyclic sort(1 to n)"+Arrays.toString(arr));
    }
    static void bubble(int[] arr){
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
    static void selection(int[] arr){
        for(int i=0;i<arr.length-1;i++){
            int last=arr.length-i-1;
            int maxi=getmax(arr,0,last);
            swap(arr,maxi,last);
            
        }
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
    static void cyclic(int[] arr0){
        int i=0;
        while(i<arr0.length){
            int correctindex=arr0[i];
            if(arr0[i]!=arr0[correctindex]){
                swap(arr0,i,correctindex);
            }
            else{
                i++;
            }
        }
    }
    static void cyclic1(int[] arr){
        int i=0;
        while(i<arr.length){
            int ci=arr[i]-1;
            if(arr[i]!=arr[ci]){
                swap(arr,i,ci);
            }
            else{
                i++;
            }
        }
    }
    static int getmax(int[] arr,int start,int end){
        int max=arr[0];
        for(int i=start;i<end;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void swap(int[] arr,int i1,int i2){
        int t=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=t;
    }
    
}
