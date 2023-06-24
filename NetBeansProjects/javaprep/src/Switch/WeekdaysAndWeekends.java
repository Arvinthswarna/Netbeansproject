/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Switch;

/**
 *
 * @author swarn_7fnn1li
 */
import java.util.*;
public class WeekdaysAndWeekends {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        switch(num)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
        }
    }
    
}
