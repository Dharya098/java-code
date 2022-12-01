class simple
{
    void simple(int p,int t,int r)
    {
      int a;
      a=p*t*r/100;
      System.out.println("Simple Interest"+a);
    }
    public static void main(String arg[])
    {
        simple ob=new simple();
        ob.simple(40,23,10);
    }
    
    
}