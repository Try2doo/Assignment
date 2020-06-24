package day2;

import java.util.Scanner;

public class Assignment27 {public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the no. to reverse.");
	int num = input.nextInt();
	int sumNum=0,mulNum =1;
	while(num!=0) {
		int digit = num % 10;
		sumNum = sumNum +digit;
		
		mulNum = mulNum*digit;
		num /= 10;
		
	}
	
	System.out.println("sum of each no= "+sumNum);
	System.out.println("multiple of each no= "+mulNum);
	input.close();
}

}
