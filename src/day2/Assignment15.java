package day2;

import java.util.Scanner;

public class Assignment15 {
	public static void main(String[] args) {
		System.out.println("Give no you want is ASCII code:");
		Scanner input = new Scanner(System.in);
		char chr = (char) input.nextInt();
		System.out.println("The ASCII value of given no. is :"+chr);
		input.close();
	}

}
