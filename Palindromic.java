import java.util.*;
public class Palindromic
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b,c=0,d;
        System.out.println("Enter Aney Number");
        a=sc.nextInt();
        d=a;
        while(d!=0)
        {
            b=d%10;
            c=c*10+b;
            d=d/10;
        }
        if(c==a)
        System.out.println("This Number is Palindromic Number");
        else
        System.out.println("This Number is ot Palindromic Number");
    }
}