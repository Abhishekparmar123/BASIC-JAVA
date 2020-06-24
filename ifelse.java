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
public class ifelse 
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 6;
        int c = 7;
        
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a+" is greatest");
            }
        }
        else if(c>b)
                {
                    if(c>a)
                    {
                        System.out.println(c+" is greatest");
                    }
                }
        else
        {
            System.out.println(b+" is greatest");
        }
    }
}
