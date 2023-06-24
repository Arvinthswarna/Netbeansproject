/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyjava.dicethrow;

/**
 *
 * @author swarn_7fnn1li
 */
public class diceFace {
    public static void main(String[] args)
    {
        diceface("",3,5);
    }
    static void diceface(String p,int target,int face)
    {
        if(target==0)
        {
            System.out.println(p);
            return;
        }
        for(int i=1;i<=face && i<=target;i++)
        {
            diceface(p+i,target-i,face);
        }
    }
    
}
