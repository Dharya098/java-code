import java.util.Scanner;
public class ForLoop{
    public static void main(String arg[]){
        System.out.println("Enter Your Number::");
        Scanner sc = new Scanner(System.in);
        int nom= sc.nextInt();
        for (int i = 0; i <= nom; i++){
            System.out.println(i);

        }
    }
}
