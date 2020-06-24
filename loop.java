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
public class loop 
{
    public static void main(String[] args)
    {
        int i;
        for(i=0;i<=10;i++)
        {
            if(i==0)
            {
                break;
            }
            System.out.println(i*2);
        }
        i=0;
        do
        {
            if(i==0)
            {
                i++;
                continue;
            }
            System.out.println(i*2);
            i++;
        }while(i<=10);
    }
}
