import java.util.Scanner;
public class Function {	
	public static int sum(int a,int b){
		int c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st No:");
		int a=sc.nextInt();
		System.out.println("Enter 2nd No:");
		int b=sc.nextInt();
		sum(a,b);
		System.out.println("Sum is:"+sum(a,b));
		
	}

}
