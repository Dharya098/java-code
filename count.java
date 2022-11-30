import java.util.Scanner;

public class count {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		System.out.println("Enter String:");
		String str = Sc.nextLine();
		int letter = 0, space = 0, digit = 0, other = 0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			if (Character.isLetter(ch[i])) {
				letter++;
			} else if (Character.isDigit(ch[i])) {
				digit++;
			} else if (Character.isSpace(ch[i])) {
				space++;
			} else {
				other++;
			}
		}
		System.out.println("lenght of String is:" + str.length());
		System.out.println("Total letter is:" + letter);
		System.out.println("Total digit is:" + digit);
		System.out.println("Total space is:" + space);
		System.out.println("Total other is:" + other);
	}
}
