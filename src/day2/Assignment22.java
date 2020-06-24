package day2;

import java.util.Scanner;

public class Assignment22 {
	public static void main(String[] args) {
		System.out.println("Enter the no. for its table.");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		int result;
		for(int i=1;i<=10;i++) {
			result = num * i;
			System.out.println(num+" * "+i+" = "+result);
			
		}
		
		input.close();
	}

}
