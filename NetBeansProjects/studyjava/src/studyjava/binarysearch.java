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
public class binarysearch {
    static int binary(int[] arr,int target)
  {
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target){
                 end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    
  }
    public static void main(String[] args) {
      int[] arr={1,2,3,4};
      int target=2;
      System.out.println(binary(arr,target));
  }
    
}
