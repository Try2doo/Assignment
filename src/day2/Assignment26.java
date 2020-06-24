package day2;

import java.util.Scanner;

public class Assignment26 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the no. to reverse.");
		int num = input.nextInt();
		int revNum =0;
		while(num!=0) {
			int digit = num % 10;
			revNum = revNum*10 +digit;
			num /= 10;
			
		}
		
		System.out.println("Reverse no= "+revNum);
		input.close();
	}

}
