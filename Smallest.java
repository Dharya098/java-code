 import java.util.*;
 class Smallest
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a==b)
        {
            System.out.println("Those are equal no");
        }
        else
        {
            if(a<b)
            {
                System.out.println("a is the smallest  no.:");
            }
            else
            {
                System.out.println("b is the smallest no.:");
            }
        }
    }
    
}