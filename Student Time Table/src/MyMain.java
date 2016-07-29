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
			Student S1 = new Student("Rajandeep Kaur Brar", 2163281, "Graduate Diplomia in Information Technology");
			S1.display();
			Student S2 = new Student("Harmandeep Kaur", 2164208 , "Graduate Diplomia in Information Technology");
			S2.display();
			
		} } }