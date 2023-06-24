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
public class linearsearch {
     static int search(int[] arr,int target)
  {
    for(int i=0;i<arr.length;i++)
    {
      if(arr[i]==target)
        return i;
    }
    return -1;
  }
    public static void main(String[] args) {
      int[] arr={1,2,3,4};
      int target=2;
      System.out.println(search(arr,target));
      
  }
    
}
