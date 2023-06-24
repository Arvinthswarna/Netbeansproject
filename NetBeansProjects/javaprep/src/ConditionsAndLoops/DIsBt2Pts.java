/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConditionsAndLoops;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class DIsBt2Pts {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int x2 = s.nextInt();
        int y1 = s.nextInt();
        int y2 = s.nextInt();
        double dis =Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(dis);
    }
    
}
