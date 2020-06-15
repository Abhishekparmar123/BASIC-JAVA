/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author abhis
 */
public class arraylist1 
{
    public static void main(String[] args)
    {
        ArrayList<String> cars = new ArrayList();
        Scanner obj = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            String y = obj.nextLine();
            cars.add(y);
        }
        System.out.println(cars.get(0));
        cars.set(0,"parmar");
        System.out.println(cars.get(0));
        cars.remove(1);
        System.out.println(cars.size());
        System.out.println(cars);
    }
}
