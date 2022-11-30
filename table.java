import java.util.Scanner;
public class table {
	public static void main(String[] args) {
      int num;
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter any number:");
      num = Sc.nextInt();
      for(int i=1;i<=10;i++)
      {
    	  System.out.println(num+"*"+i+"="+num*i);
      }
	}
}
