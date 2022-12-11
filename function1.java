import java.util.Scanner;
public class Function1 {
	
	public static void average(int a,int b,int c){
		int avg=(a+b+c)/3;
		System.out.print(avg);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		System.out.println("Enter 3rd No:");
		int c=sc.nextInt();
        average(a,b,c);
	}
}
