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
public class bsin2d {
    public static void main(String[] args){
        int arr[][]={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        System.out.println(Arrays.toString(search(arr,33)));
    }
    static int[] search(int[][]arr,int target){
        int row=0;
        int col=arr[0].length-1;
        while(row<arr.length && col>=0){
            if(arr[row][col]==target){
                return new int[]{row,col};
            }
            if(arr[row][col]<target){
                row++;
            }
            if(arr[row][col]>target){
                col--;
            }
        }
        return new int[]{-1,-1};
        
    }
    
}
