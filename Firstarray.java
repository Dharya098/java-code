import java.util.Scanner;

public class Firstarray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        String[] names = new String[numStudents];
        int[] rollNos = new int[numStudents];
        double[] marks = new double[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for student " + (i+1) + ":");
            System.out.print("Name: ");
            names[i] = scanner.next();
            System.out.print("Roll Number: ");
            rollNos[i] = scanner.nextInt();
            System.out.print("Mark: ");
            marks[i] = scanner.nextDouble();
        }

        System.out.println("The details of the students are:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i+1) + ": " + names[i] + " (" + rollNos[i] + ") - Mark: " + marks[i]);
        }
    }
}
