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
public class CustomQueue {
     protected int[] data;
    private static final int size=10;
    int end = 0;
    
    
    
    CustomQueue(int size)
    {
        data=new int[size];
    }
    
    public boolean isFull()
    {
        return end == data.length;
    }
    
    public boolean isEmpty()
    {
        return end== 0;
    }
    
     public boolean insert(int item)
    {
        if(isFull())
        {
            System.out.println("Queue is full");
            return false;
        }
        
        data[end++]=item;
        return true;
    }
     
     public int remove()
     {
         if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        int removed = data[0];
        for(int i=1;i<end;i++)
        {
            data[i-1]=data[i];
        }
        end--;
        return removed;
     }
     
     public int front()
     {
          if(isEmpty())
        {
            System.out.println("Queue is empty");
            return -1;
        }
        return data[0];
         
     }
     
     public void display()
     {
         for(int i=0;i<end;i++)
         {
             System.out.print(data[i]+"<-");
         }
         System.out.println("END");
     }
     
     public static void main(String[] args)
     {
         CustomQueue queue = new CustomQueue(5);
         queue.insert(3);
         queue.insert(4);
         queue.insert(67);
         queue.display();
         System.out.println(queue.remove());
         queue.display();
         
         
     }
    
    
}
