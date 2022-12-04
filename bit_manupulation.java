import java.util.Scanner;
public class Bit_manupulation {
	public static void main(String[] args) {
		
		int n=5; 
		int pos=2;
		int bitMask = 1<<pos;
		if ((bitMask & n) == 0){
			System.out.print("Bit Was Zero");
		}
		else{
			System.out.print("Bit Was one");
		}
		System.out.println();
		System.out.println();
	
		int n1=5; 
		int pos1=1;
		int bitMask1 = 1<<pos1;
		int newNumber = bitMask1 | n1;
		System.out.print(newNumber);
		
		System.out.println();
		System.out.println();
		
		int n2=5;  
		int pos2=2;
		int bitMask2 = 1<<pos2;
		int notBitMask = ~(bitMask2);
		int newNumber1 = notBitMask & n2;
		System.out.print(newNumber1);
		
		System.out.println();
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter operation no:");
		int oper=sc.nextInt();
		
		int n3=5;  
		int pos3=1;
		int bitMask3 = 1<<pos3;
		if(oper == 1){
			
			int newNumber2 = bitMask3 | n3;
			System.out.print(newNumber2);
		}
		else{
			
			int newbitMask3 = ~(bitMask3);
			int newNumber2 = newbitMask3 & n3;
			System.out.print(newNumber2);
		}
	}
}
