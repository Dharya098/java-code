import java.util.Scanner;
public class ifelseStatment {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  Number");
        int N = scanner.nextInt();
        
         
        if (N % 2 == 1) {
            System.out.println("Weird");
        }
         
        else if (N % 2 == 0){
            if (2 <= N && N <= 5) {
                
                System.out.println("Not Weird");
            }
            else if (6 <= N && N <= 20){
                
                System.out.println("Weird");
            }
            else {
                
                System.out.println("Not Weird");
            }
        }
        
    }
}