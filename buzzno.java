import java.util.*;
public class buzzno
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your no");
        int a;
        a=sc.nextInt();
        if(a%10==7||a%7==0)
        System.out.println("Is a buzz no");
        else
        System.out.println("Is not a buzz no");
        
    }
}