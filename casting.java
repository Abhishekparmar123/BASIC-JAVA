/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author abhis
 */
public class casting 
{
    public static void main(String[] arg)
    {
        int MyNum = 9;
        double MyDouble = MyNum ; // Automatically casting: int to double
        double MyDouble1 = 9.85;
        int Num = (int)MyDouble1 ;// Manual casting: double to int
        
        System.out.println(MyNum);
        System.out.println(MyDouble);
        System.out.println(MyDouble1);
        System.out.println(Num);
    }
}
