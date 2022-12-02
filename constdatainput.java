import java.util.*;
class simple
{
    int p,t,r;
    simple(int a,int b,int c)
    
    {
        p=a;
        t=b;
        r=c;
    }
    void display()
    { 
        double si;
        si=p*t*r/100;
        System.out.println("si"+si);
    }
     
}
    public class constdatainput
    {
        public static void main(String arg[])
        
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the values");
            int a,b,c;
            a=sc.nextInt();
            b=sc.nextInt();
            c=sc.nextInt();
            simple ob=new simple(a,b,c);
            ob.display();
            
        
        
    }
}