package Day1;

import java.util.Scanner;

public class assignment3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any two nos.\n");
		double x = sc.nextDouble();
		double y = sc.nextDouble();
		double sum = x+y;
		double avg = sum/2;
		System.out.println("Sum of given nos.="+sum);
		System.out.println("Average of given Nos.="+avg);
		sc.close();
		
	}

}
