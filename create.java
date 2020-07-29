/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;
import java.io.File;
import java.io.IOException;
/**
 *
 * @author abhis
 */
public class create 
{
    public static void main(String[] args)
    {
        try
        {
            File obj = new File("exercise.txt");
            if(obj.createNewFile())
            {
                System.out.println("file created ....");
            }
            else
            {
                System.out.println("File already exists ....");
            }
        }
        catch(IOException e)
        {
            System.out.println("an error occure ....");
            e.printStackTrace();
        }
    }
}
