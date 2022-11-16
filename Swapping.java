import java.util.*;
public class Swapping
{
    public static void main(String arg[])
    {
        int x,y,t;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        x=sc.nextInt();
        y=sc.nextInt();
        t=x;x=y;
        y=t;
        System.out.println("After swapping:"+x+" "+y);
        System.out.println();
    }
}