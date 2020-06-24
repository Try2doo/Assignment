package Day1;

import java.util.Scanner;

public class Assignment12 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Name:");
		String name = input.nextLine();
		System.out.println("Enter Nationality:");
		String nationality = input.nextLine();
		System.out.println("Enter Roll:");
		String roll = input.nextLine();
		
		
		System.out.println("Your Details: ");
		System.out.println("Name : "+name);
		System.out.println("Nationality: "+nationality);
		System.out.println("Roll : "+roll);
		input.close();
		

	}

}
