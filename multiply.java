import java.util.Scanner;

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
