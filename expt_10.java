import java.util.Scanner;

public class expt_10 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String st = sc.nextLine();
		String nst = "";
		for (int i = 0; i < st.length(); i++) {
			char a = st.charAt(i);
			nst = a + nst;
		}
		System.out.println("Revertse of string is:" + nst);
	}

}