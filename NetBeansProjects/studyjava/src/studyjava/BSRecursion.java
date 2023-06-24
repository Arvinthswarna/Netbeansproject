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
public class BSRecursion {
    public static void main(String[] args){
        int[] arr={-1,0,3,5,9,12};
        int target=13;
        System.out.println(search(arr,target,0,arr.length-1));
    }
    static int search(int[] arr,int target,int s,int e){
        int m=s+(e-s)/2;
        if(s>e) return-1;
        if(target==arr[m]) return m;
        if(target<arr[m]) return search(arr,target,s,m-1);
        else return search(arr,target,m+1,e);
    }
    
}
