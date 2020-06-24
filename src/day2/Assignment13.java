package day2;

import java.util.Scanner;

public class Assignment13 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any Negative no.:");
		double num = input.nextDouble();
		if (num>0.0) {	//Didn't work!!!!!
			System.out.println("Number You Entered = "+num);
			
		}else {
			System.out.println("Enter Negative Value Only !!!");
		}	
		input.close();
	}

}
