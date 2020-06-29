package javaapplication1;

/**
 *
 * @author abhis
 */
public class multidemensional 
{
    public static void main(String[] args)
    {
        int[][] mynum = {{1,2,3,4},{5,6,7},{8,9}};
        for(int i=0;i<mynum.length;i++)
        {
            for(int j=0;j<mynum[i].length;j++)
            {
                System.out.println(mynum[i][j]);
            }
        }
    }
}
