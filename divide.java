import java.util.Scanner;

public class divide 
{
     public static void main(String[] args)
     {
         Scanner obj = new Scanner(System.in);
         float a,b,c;
         System.out.println("enter a number  : ");
         a = obj.nextFloat();
         
         System.out.println("enter the dividing number : ");
         b = obj.nextFloat();
         
         c = a/b ;
         
         System.out.println("THE RESULT   : "+c);
     }
}
