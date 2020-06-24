package day3;

import java.util.Scanner;

public class Assignment29 {
	public static double isFactorial(double num) {
		
		double result = 1;
		for(double i=1;i<=num;i++) {
			result = result * i;
			}
		return result;
		}


	public static double arthsequence(double nth) {
		double temp = 1;
		for (int i=1;i<=nth;i++) {
			double fac = isFactorial(i);
			temp = temp + i/fac;
			
		}
		return temp;
		
		
	}
	public static void main(String[] args) {
		System.out.println("Give the nth term:");
		Scanner input = new Scanner(System.in);
		double nth = input.nextInt();
		double result = arthsequence(nth);
		System.out.println(result);
		input.close();
	}
	
	
}

