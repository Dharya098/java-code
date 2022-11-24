import java.util.*;
public class Array
{
    public static void main(String arg[])
    {
    Scanner sc= new Scanner(System.in);
    int a[]=new int[10];
    int i;
    for(i=0;i<10;i++)
    {
        a[i]=sc.nextInt();
        {
            for(i=0;i<10;i++)
            {
                if(a[i]%2==0)
                System.out.print("\t"+a[i]);
            }
        }
    }
  }
}