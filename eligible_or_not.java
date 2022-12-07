import java.util.Scanner;
public class Vote {
	
	public static void findgreater(int a){
		if(a>=18){
			System.out.println("Person is Elegible");
		}
		else{
			System.out.println("Person is not Elegible");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age:");
		int a=sc.nextInt();
		findgreater(a);
	}
}
