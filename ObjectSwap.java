import java.util.*;
class swap
{
    int x,y,t;
    void talk()
    
    {
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
public class ObjectSwap
{
     public static void main(String arg[])
    {
    swap raju=new swap();
    raju.talk();
    }
}
