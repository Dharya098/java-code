import java.util.Scanner;
public class binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any decimal No:");
		int n=sc.nextInt();
		int a;
		String x="";
		while(n>0){
			a=n%2;
			x=a+""+x;
			n=n/2;
		}
		System.out.print("Binary number is "+x);
	}
}
