package Day1;

import java.util.Scanner;

public class assignment6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius:");
		double r = input.nextDouble();
		double pCir = 2*Math.PI*r;
		System.out.println("Perimeter of Circle: "+pCir);
		
		System.out.println("Enter length and width of Recatangle:");
		double l = input.nextDouble();
		double w = input.nextDouble();
		double pRec = 2*(l+w);
		System.out.println("Perimeter of Circle: "+pRec);
		
		System.out.println("Enter sides of trangle:");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		double pTri = a+b+c;
		System.out.println("Perimeter of Circle: "+pTri);
		input.close();
	}

}
