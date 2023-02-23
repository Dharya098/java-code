import java.util.Scanner;
public class LoopUserInput {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int num=sc.nextInt();
        int i;
        for( i = 0; i < num; i++);{
            System.out.println("You Enter The Number is:"+i);
        }
        sc.close();
    }
}
