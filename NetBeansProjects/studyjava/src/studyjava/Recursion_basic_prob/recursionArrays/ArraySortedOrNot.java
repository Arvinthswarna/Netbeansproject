/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.Recursion_basic_prob.recursionArrays;

/**
 *
 * @author swarn_7fnn1li
 */
public class ArraySortedOrNot {
   public static void main(String[] args)
   {
        int[] arr={1,2,3,4,5};
        
        System.out.print(sorted(arr,0));
   }
   static boolean sorted(int[] arr,int ind)
   {
       if(ind==arr.length-1) return true;
       else return arr[ind]<arr[ind+1] && sorted(arr,ind+1);
       
   }
    
    
}
