import java.util.*;
public class SwitchMonth
{
    public static void main(String arg[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number");
       int a,b;
       b = sc.nextInt();
       {
       switch(b)
       {
       case 1 :System.out.println("january");
       break;
       case 2:System.out.println("februayr");
       break;
       case 3:System.out.println("March");
       break;
       case 4:System.out.println("April");
       break;
       case 5:System.out.println("May");
       break;
       case 6:System.out.println("June");
       break;
       case 7:System.out.println("Julay");
       break;
       case 8:System.out.println("August");
       break;
       case 9:System.out.println("Sepetember");
       break;
       case 10:System.out.println("October");
       break;
       case 11:System.out.println("November");
       break;
       case 12:System.out.println("December");
       break;
       default:
       case 13:System.out.println("Wrong choise");
       
    }
    }
}
}