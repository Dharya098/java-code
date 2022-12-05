import java.util.Scanner;

public class expt_11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Number:");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}