class Overloaded
{
    double area(int s)
    {
        System.out.println("Area of the Square:"+(s*s));
    }

    double area(double I,double b)
    {
        System.out.println("Area of the Rectangle:"+(I*b));
    }
    double area(double r)
    {
        System.out.println("Area of circle"+(3.14*r*r));
    }
}
class Over
{
    public static void main(String arg [])
    {
            Overloaded obj=new Overloaded();
            obj.area(3);
            obj.area(3.4,2.5); 
            obj.area(4,6);
            
    }
}
