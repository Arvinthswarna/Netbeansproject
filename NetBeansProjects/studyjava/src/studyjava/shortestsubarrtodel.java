/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
package studyjava;

/**
 *
 * @author swarn_7fnn1li
 */
public class shortestsubarrtodel {
    public static void main(String[] args)
            
    {
      int[] arr={1,2,3,10,4,2,3,5};
      findshort(arr);
    }
    static int findshort(int[] arr)
    {
        ArrayList<Integer> li= new ArrayList<>();
        int start=0;
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]<arr[end])
            {
                start++;
                end--;
            }
            else{
                li.add(arr[start]);
            }
            li.add(0);
        }
        return li.size();
    }
    
}
