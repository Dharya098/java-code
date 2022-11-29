
import java.util.Scanner;

public class Exc_12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st Number");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd Number");
        int b = sc.nextInt();
        if (a < b) {
            System.out.println(b + "is Greater");
        } else {
            System.out.println(a + "is Greater");
        }
        if (a == b) {
            System.out.println("0");
        }
        if (a % 6 == b % 6) {
            if (a < b) {
                System.out.println(a + "is Smaller");
            } else {
                System.out.println(b + "is Smaller");
            }
        }
    }
}