package day2;

import java.util.Scanner;

public class Assignment16 {
	public static void main(String[] args) {
		System.out.println("Enter any No.");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		if (x%2==0) {
			System.out.println("Number is even");
		}else {
			System.out.println("Number is odd");
		}
		input.close();
			
	}

}
