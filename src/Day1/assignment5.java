package Day1;

import java.util.Scanner;

public class assignment5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of circle:");
		double r = sc.nextDouble();
		double aCir = Math.PI*r*r;
		System.out.println("area of Circle="+ aCir);
		System.out.println("Enter the Length and Width of Ractangle:");
		double l = sc.nextDouble();
		double w = sc.nextDouble();
		double aRec = l*w;
		System.out.println("area of Rectangle="+ aRec);
		System.out.println("Enter the length of sides of triangle:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double s= a+b+c;
		double aTri =Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("area of Trangle="+ aTri);
		sc.close();
	}

}
