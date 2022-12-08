import java.util.Scanner;
public class Two_d_array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row No:");
		int rows=sc.nextInt();
		System.out.println("Enter Column No:");
		int colm=sc.nextInt();
		int[][] numbers = new int[rows][colm];
		
		for(int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
				System.out.print("Enter the element of array:");
				numbers[i][j] = sc.nextInt();
			}
		}

		for(int i=0;i<rows;i++){
			for(int j=0;j<colm;j++){
				System.out.print(numbers[i][j]+" ");
			}
			System.out.println();
		}	
	}
}
