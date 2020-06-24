package day2;

import java.util.Scanner;

public class Assignment20 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the opetator.(+,-,/,*)");
		char operatior = input.next().charAt(0);
		System.out.println("Enter your first no.");
		double firstNumber = input.nextDouble();
		System.out.println("Enter your second no.");
		double secNumber = input.nextDouble();

		double result=0.0;
		switch(operatior) 
		{
			case '+':
				result = firstNumber+secNumber;
				break;
			case '-':
				result = firstNumber-secNumber;
				break;
			case '/':
				result = firstNumber/secNumber;
				break;
			case '*':
				result = firstNumber*secNumber;
				break;
			default :
				System.out.println("Wrong operator!!!");
				break;
			
		}
		
		System.out.println("Your solution is= "+result);
		input.close();
	}

}
