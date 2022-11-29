import java.util.*;

public class Swap {
       public static void main(String[] args) {
              int a, b, c;
              Scanner Sc = new Scanner(System.in);
              System.out.println("Enter te value of A");
              a = Sc.nextInt();
              System.out.println("Enter the value of B");
              b = Sc.nextInt();
              c = a;
              a = b;
              b = c;
              System.out.println("value of A is:" + a);
              System.out.println("value of B is:" + b);
       }

}
