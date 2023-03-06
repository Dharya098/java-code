import java.sql.SQLOutput;
import java.util.*;
public class StringLength {
    public static void main(String arg []){
        System.out.println("Enter Your Name");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Length Of Your Name::" + name.length());

    }
}
