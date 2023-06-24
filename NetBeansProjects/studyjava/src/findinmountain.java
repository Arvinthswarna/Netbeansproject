/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swarn_7fnn1li
 */
public class findinmountain {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,3,1};
        int target=3;
        int peak=findpeak(arr,target);
        System.out.println("peak element"+peak);
        int ans=binarysearch(arr,target,0,peak);
        //System.out.println("target in asc mountain "+ans);
        int ans2=binarysearch(arr,target,peak+1,arr.length-1);
        //System.out.println("target in desc mountain "+ans2);
        if(ans>ans2){
            System.out.println("target in desc mountain "+ans2);
        }
         System.out.println("target in asc mountain "+ans);
        
    }
    static int binarysearch(int arr[],int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }return start;
        
    }
    static int findpeak(int[] arr,int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid>0 && arr[mid]>arr[mid-1]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return end;
    }
    
}
