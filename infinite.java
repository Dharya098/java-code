import java.util.Scanner;
public class Infinite {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No:");
		int n = sc.nextInt();
		int i=1;
		do{
			System.out.println("Hello");
		}
		while(n>=i);
		{
			System.out.println("Hello");
			i++;
		}
	}
}
