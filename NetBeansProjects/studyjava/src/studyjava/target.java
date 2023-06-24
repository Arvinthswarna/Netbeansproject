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
public class target {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7};
        targetsum(arr,9);
    }
    static void targetsum(int[] arr,int target)
    {
        int[] ans = new int[100];
        int ind=0;
        
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i+1;
            if(arr[i]+arr[j] == target)
            {
                ans[ind++]=arr[i];
                ans[ind++]=arr[j];
                        
            }
                
            
        }
        for(int i=0;i<100;i++)
        {
            System.out.print(ans[i]);
        }
    }
}
