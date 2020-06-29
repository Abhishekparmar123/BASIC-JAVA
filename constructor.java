package javaapplication1;

/**
 *
 * @author abhis
 */
public class constructor 
{
    int x;
    
    public constructor()
    {
        x=0;
    }
    public constructor(int a)
    {
        x=a;
    }
    
    public static void main(String[] args)
    {
        constructor obj = new constructor();
        constructor obj1 = new constructor(9);
        
        System.out.println(obj.x+","+obj1.x);
    }
}
