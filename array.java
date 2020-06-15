
public class array 
{
    public static void main(String[] args)
    {
        String[] car = {"volve","BMW","ford","mazda"};
        int[] mynum = {10,20,30,40};
        System.out.println(car[0]);
        for(int i=0;i<mynum.length;i++)
        {
            System.out.println(mynum[i]);
        }
        for(String i : car)
        {
            System.out.println(i);
        }
    }
}
