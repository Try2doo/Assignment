package day2;

import java.util.Scanner;

public class Assignment14 {
	public static void main(String[] args) {
		System.out.println("Enter any two nos. you want to compair:");
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		int y = input.nextInt();
		if(x==y) {
			System.out.println("Two Numbers are Equal.");
		}else if (x>y){
			System.out.println("X is greater than Y.");
		}else {
			System.out.println("Y is greater than X.");
		}
		input.close();
		
	}

}
