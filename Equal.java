import java.util.*;
public class Equal
{
   public static void main(String args[]) 
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter First number");
       int a =sc.nextInt();
       System.out.println("Enter Second number");
       int b =sc.nextInt();
       if(a==b)
        {
            int S=a*a*a;
           System.out.println("The numbers are equal its cube is " +S);
        }
        else
        {
            int S=a*a;
            System.out.println("The numbers are not equal its First no. square is= "+S);
            int K=b*b;
         System.out.println("The numbers are not equal its Second no. square is= "+K);  
        }
   }
}