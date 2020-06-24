package day2;

import java.util.Scanner;

public class Assignment24 {
	public static void main(String[] args) {
		System.out.println("Enter the no.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result = 1;
		for(int i=1;i<=num;i++) {
			result = result * i;	
		}
		System.out.println(num+"!"+"="+result);
		input.close();

	}
}
