/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author swarn_7fnn1li
 */
public class coding {
    
    static int Matrix(int[]arr,int i,int j)
    {
        int m = Integer.MAX_VALUE;
       
        if(i==j) 
             return 0;
        for(int k=i; k<j; k++)
        {
            int c = Matrix(arr,i,k) + Matrix(arr,k+1,j) + arr[i-1] * arr[k] * arr[j];
            if(c < m)
                m = c;
        }
        return m;
        
    }
    public static void main(String[] args)
    {
       int[] arr = new int[]{1,2,5,6,7};
       int l = arr.length;
       int i=1;
       System.out.println(Matrix(arr,i,l-1));
    }
    
}
