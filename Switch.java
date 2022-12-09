import java.util.*;
public class Switch
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("###Your Choice###");
        int a,b,ch;
        System.out.println("press 1 for addition");
        System.out.println("press 2for substraction ");
        System.out.println("press 3 for multiplication ");
        System.out.println("press 4 for division ");
        System.out.println("Enter Two Number");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Enter Your Choice");
        ch = sc.nextInt();
        switch (ch)
        {
            case 1 : System.out.println("addition"+(a+b));
            break;
            case 2 : System.out.println("substraction"+(a+b));
            break;
            case 3 : System.out.println("multiplication"+(a+b));
            break;
            case 4 : System.out.println("division"+(a+b));
            break;
            default:System.out.println("Wrong Choice");
            break;
        }
    }
}