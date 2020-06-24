package Test1;

import java.util.Scanner;

import Day1.Assignment8;
import Day1.Assignment9;
import day11.Assignment6;
public class Test1 {

	public static void main(String[] args) {
		Assignment6 ob = new Assignment6();
		Assignment9 ob1 = new Assignment9();
		Assignment8 ob2 = new Assignment8();

		Scanner input = new Scanner(System.in);
		String decision = "";
		
		do {
			
			System.out.println("Which operation do you want to perform: ");
			String choice = input.next();

			switch(choice) {
			case "wconvert":
				System.out.println("Enter the weight in Lb .");
				int n = input.nextInt();
				ob1.convertWeight(n);
				break;
				
			case "tconvert":
				System.out.println("which temp you wanna convert? F or C ");
				input = new Scanner(System.in);
				String tt = input.nextLine();
				System.out.println("Enter temperature. ");
				int tem = input.nextInt();
				ob2.tcovert(tt,tem);
				break;
			
			
			case "table":
				System.out.println("Enter number to find the table: ");
				int num = input.nextInt();
				ob.printTable(num);
				break;
				
			case "factorial":
				System.out.println("Enter number to find the factorial: ");
				num = input.nextInt();
				ob.findFactorial(num);
				break;
			case "prime":
				System.out.println("Enter number to find the prime: ");
				num = input.nextInt();
				ob.isPrime(num);
				break;

		
			default:
				System.out.println("wrong choice!!!");
			}

			System.out.println("do you want continue?");
			decision = input.next();	
			
			
			
			
		}while(decision.equalsIgnoreCase("yes"));
		System.out.println("Thanks");
		
		
		

		input.close();
	}

}
