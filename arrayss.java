import java.util.Scanner;
public class Arrayss {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of array:");
		int size=sc.nextInt();
		int[] numbers = new int[size];
		
		for(int i=0;i<size;i++){
			System.out.print("Enter the element of array:");
			numbers[i]=sc.nextInt();
		}
		
		System.out.print("Enter the value of X:");
		int x=sc.nextInt();
	
		for(int i=0;i<size;i++){
			if(numbers[i]==x){
				System.out.println("X is found at index:"+i);
			}
		}
	}
}
