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
public class linearsearch {
    public static void main(String[] args)
    {
        int[] arr={1,2,56,78,6};
        System.out.print(search(arr,78,0));
    }
    static boolean search(int[] arr,int target,int ind)
    {
        if(ind==arr.length) return false;
        else return arr[ind]==target || search(arr,target,ind+1);
    }
    static int find(int[] arr,int target,int ind)
    {
        if(ind==arr.length) return -1;
        if(arr[ind]==target) return ind;
        else  return find(arr,target,ind);
        
    }
    
}
