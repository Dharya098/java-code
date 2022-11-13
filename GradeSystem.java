import java.util.*;
public class GradeSystem
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c,d,e;
        System.out.println("Enter the marks of 5 subjects");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        e=sc.nextInt();
        int total;
        int avrage;
        int percentage;
        int grade;
        double Total = a+b+c+d+e;
        System.out.println("The total marks="+Total);
        double Average = Total/5.0;
        System.out.println("The average marks="+Average);
        double Percentage=(double)((Total/500.0)*100);
        System.out.println("The percentage="+Percentage);
        //calculate the Grade
        if(Average>=90)
        {
        System.out.println("grade=O");
        }
        else if(Average>=80 && Average<90)
        {
            System.out.println("grade=E");
        }
        else if(Average>=70 && Average<80)
        {
            System.out.println("grade=A");
        }
        else if(Average>=60 && Average<70)
        {
            System.out.println("grade=B");
        }
        else if(Average>=50 && Average<60)
        {
            System.out.println("grade=C");
        }
        else if(Average>=40 && Average<50)
        {
            System.out.println("grade=D");
        
        }
        else
        {
            System.out.println("Fail");
        }
    }
} 