/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashMap;
import java.util.*;
/**
 *
 * @author abhis
 */
public class hashmap 
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> stu = new HashMap<Integer,String>();
        stu.put(1,"abhishek");
        stu.put(2,"annad");
        stu.put(3,"ram");
        System.out.println(stu);
        System.out.println(stu.get(1));
        System.out.println(stu.size());
        stu.remove(3);
        System.out.println(stu);
     
    }
}
