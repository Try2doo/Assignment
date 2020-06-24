package day3;

import java.util.Scanner;

public class Assignment30 {
	public static void main(String[] args) {
		int a=1,b=1,temp=0;
		
		
		System.out.println("Enter your Last Fibonacci series no.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.print("1 "+"1 ");
		
		while(temp<=num) 
		{
			temp = a + b;
			if (temp>num)
				break;
			System.out.print(temp+" ");
			a = b;
			b = temp;

		}
		sc.close();
	}

}
