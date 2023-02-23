import java.util.Scanner;
public class FirstString {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("****Enter Your Porsnal Information****");
        System.out.println("Enter Your Name");
        String nam=sc.nextLine();
        System.out.println("Your Name Is: "+nam);

        System.out.println("Enter Your Age");
        int age=sc.nextInt();
        System.out.println("Your Age: "+age);

        System.out.println("Enter Your Gendar");
        String gen=sc.next();
        System.out.println("Your Gendar Is: "+gen);

        System.out.println("Enter your Monbile No");
        int mob=sc.nextInt();
        System.out.println("Your Mobile No is: "+mob);
        sc.close();
    }
}
