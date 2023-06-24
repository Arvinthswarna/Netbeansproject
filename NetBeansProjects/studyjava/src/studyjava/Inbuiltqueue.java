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
import java.util.*;
public class Inbuiltqueue {
    public static void main(String[] args) {
      Queue<Integer> queue = new LinkedList<>();
      queue.add(4);
      queue.add(20);
      queue.add(11);
      System.out.println("queue");
      System.out.println(queue.peek());
      System.out.println(queue.remove());
      
      /* "deque" insertions and deletions can be performed on both the ends*/
      Deque<Integer> deque = new ArrayDeque<>();
      deque.add(4);
      deque.addLast(24);
      System.out.println("deque");
      deque.removeFirst();
      System.out.println(deque);
  }
    
}
