import java.util.*;
class SUM

{
  int number, digit, sum = 0;
  void talk()
  {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number:");
     number = sc.nextInt();
     while(number > 0)
     {
        digit = number % 10;
        sum = sum + digit;
        number = number / 10;
        
     }
     System.out.println("Sum of Digits:"+sum);
  }
}
public class SumOfDigit
{
    public static void main(String args[])
    {
        SUM s=new SUM();
        s.talk();
    }
}