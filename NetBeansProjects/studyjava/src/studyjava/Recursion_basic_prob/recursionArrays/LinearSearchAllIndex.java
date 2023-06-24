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
public class LinearSearchAllIndex {
    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6};
        System.out.print(findAll(arr,6,0,ArrayList<>));
    }
    static ArrayList<Integer> findAll(int[] arr,int target,int ind,ArrayList<Integer>list)
    {
        if(ind==arr.length) return list;
        if(arr[ind]==target) return list.add[ind];
        return findAll(arr,target,ind+1,list);        
    }
}
