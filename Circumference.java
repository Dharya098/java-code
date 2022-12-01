import java.util.Scanner;

public class Circumference {
	public static double getCircumference(double r) {
		return 2 * 3.14 * r;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius:");
		double r = sc.nextDouble();
		System.out.println(getCircumference(r));
	}
}
