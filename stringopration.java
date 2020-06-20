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
public class stringopration 
{
    public static void main(String[] args)
    {
        String txt = "AbCdefghiJKLmnOPqrStuvWxYz";
        String T = "A Pen is most powerfui ";
        System.out.println(txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        System.out.println(T.indexOf("most"));
    }
}
