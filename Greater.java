import java.util.*;

 public class Greater
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter two number");
        a=sc.nextInt();
        b=sc.nextInt();
        if(a>b)
        System.out.println(a+"is greatest number");
        else
        System.out.println(b+"is greater number");
        
    }
}
   