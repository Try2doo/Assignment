package day2;

import java.util.Scanner;

public class Assignment19 {
	public static void main(String[] args) {
		System.out.println("Enter the sides of Triangle:");
		Scanner input = new Scanner(System.in);
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		if(a==b && a==c) {
			System.out.println("Triangle is isosceles triangle.");
			
		}else if(a==b && a==c) {
			System.out.println("Triangle is equilateral triangle.");
		}else {
			if(a*a==b*b+c*c||b*b==a*a+c*c ||c*c==a*a+b*b) {
				System.out.println("Triangle is right angle triangle.");
			}
		}
		
		input.close();
	}

}
