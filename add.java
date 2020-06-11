/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg4sem;
import java.util.Scanner;

/**
 *
 * @author abhis
 */
public class add 
{
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER FIRST NUMBER : ");
        int a = obj.nextInt();
        System.out.println("ENTER SECOND NUMBER : ");
        int b = obj.nextInt();
        int c = a+b;
        System.out.println("SUM = "+ c);
    }
}
