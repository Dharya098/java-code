
class simple
{
    int p,t,r;
    simple()
    {
        p=1000;
        t=50;
        r=4;
    }
    void display()
    { 
        double si;
        si=p*t*r/100;
        System.out.println("si"+si);
    }
     
}
    public class constructor
    {
        public static void main(String arg[])
        
        {
            simple ob=new simple();
            ob.display();
        
        
    }
}