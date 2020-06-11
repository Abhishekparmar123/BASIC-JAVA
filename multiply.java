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
public class multiply 
{
    public static void main(String[] args)
     {
         Scanner obj = new Scanner(System.in);
         double a,b,c;
         
         System.out.println("enter first number  : ");
         a = obj.nextDouble();
         
         System.out.println("enter second number  : ");
         b = obj.nextDouble();
         
         c=a*b;
         System.out.println("the result : "+c);
     }
}
