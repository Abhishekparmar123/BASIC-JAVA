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
public class function 
{
    static int sum(int a,int b)
    {
        return a+b;
    }
    
    public static void main(String[] args)
    {
        System.out.println(sum(5,6));
        int x = sum(7,9);
        System.out.println("the sum is : "+x);
    }
}
