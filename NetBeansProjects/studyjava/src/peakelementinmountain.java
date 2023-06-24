/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swarn_7fnn1li
 */
public class peakelementinmountain{
    public static void  main (String args[]){
        int[] arr={0,1,2,4,2,1};
        int target=3;
        int ans=peak(arr);
        int first=binarysearch(arr,target,0,ans);
        if(first!=-1){
            System.out.println(first);
        }
        System.out.println(binarysearch(arr,target,ans+1,arr.length-1));
        System.out.println(ans);
    }
      static int binarysearch(int[] arr,int target,int start,int end){
          boolean isasc =arr[start]<arr[end];
          while(start<=end){
              int mid=start+(end-start)/2;
          
          if(arr[mid]==target){
              return mid;
          }
          if(isasc){
              if(target<arr[mid]){
                  end=mid-1;
              }else{
                  start=mid+1;
              }
          }else{
              if(target<arr[mid]){
                  start=mid+1;
              }else{
                  end=mid-1;
              }
          }
          }
          return -1;
          
      }
        static int peak(int arr[]){
            int start=0;
            int end=arr.length-1;
            while(start<=end){
                int mid=start+(end-start)/2;
                if(mid>0 && arr[mid]<arr[mid-1]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
            return end;
        }
    }
    

