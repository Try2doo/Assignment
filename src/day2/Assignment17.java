package day2;

import java.util.Scanner;

public class Assignment17 {

	public static void main(String[] args) {
		System.out.println("Enter year you want to check:");
		Scanner input = new Scanner(System.in);
		int year = input.nextInt();
		if(year % 4 ==0) {
			if  (year % 100 ==0) {
				if (year % 400 ==0) {
					System.out.println("Year "+year+"is leap year.");
				}else {
					System.out.println("Year "+year+" is not leap year.");
				}
			}else {
				System.out.println("Year "+year+"is leap year.");
			}
		}else {
			System.out.println("Year "+year+"is leap year.");
		}
			
		
		input.close();
	}

}
