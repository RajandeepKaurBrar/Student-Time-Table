import java.util.Scanner;

public class MyMain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice;
		// for the output
		System.out.println("A. View Student Info");
		System.out.println("B. View Course Info");
		System.out.println("C. View Student TimeTable");
		System.out.println("Enter Your Choice: ");
		choice = input.nextLine();

		if (choice.equals("A")) {
			Student S1 = new Student("Rajan Brar", 1234, "IT7320");
			S1.display();
			
		} } }