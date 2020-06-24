package day2;

import java.util.Scanner;

public class Assignment21 {
	public static void main(String[] args) {
		System.out.println("Enter any no.from 1-7");
		Scanner input = new Scanner(System.in);
		int day = input.nextInt();
		
		switch(day)
		{ 
		case(1):
			System.out.println("Today is SUNDAY.");
			break;
		case(2):
			System.out.println("Today is Monday.");
			break;
		case(3):
			System.out.println("Today is Tuesday.");
			break;
		case(4):
			System.out.println("Today is Wednesday.");
			break;
		case(5):
			System.out.println("Today is Thursday.");
			break;
		case(6):
			System.out.println("Today is Friday.");
			break;
		case(7):
			System.out.println("Today is Saturday.");
		default:
			System.out.println("Wrong value!!!");
		}
			
		
		
		
		input.close();
	}

}
