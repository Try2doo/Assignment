package Day1;

import java.util.Scanner;

public class assignment4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the principle Amount:");
		double p = sc.nextDouble();
		System.out.println("Enter the time:\n");
		double t = sc.nextDouble();
		System.out.println("Enter the rate per Year:\n");
		double r = sc.nextDouble();
		double sInt = (p*t*r)/100;
		System.out.println("Simple Interest= "+ sInt);
		sc.close();
	
	}
}
