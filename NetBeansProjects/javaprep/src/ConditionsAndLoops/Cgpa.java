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
public class Cgpa {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        double tam=9.0,eng=9.8,mat=8.8,sci=9.2,soc=9.9;
        double  cgpa = (tam+eng+mat+sci+soc)/5;
        double cgpaper = (double) 9.5 * cgpa;
        System.out.println(cgpaper);
    }
    
}
