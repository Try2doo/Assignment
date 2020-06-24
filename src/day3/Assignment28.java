package day3;

import java.util.Scanner;

public class Assignment28 {

	public void findNthPrime(int n) {

		for (int i = 2; i <= n; i++) {

			if (isPrime(i)) {
				System.out.println(i);
			}
		}

	}

	public boolean isPrime(int n) {
		boolean isPrimeNumber = true;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				isPrimeNumber = false;
				break;
			}
		}

		return isPrimeNumber;
	}

	public static void main(String[] args) {

		System.out.println("Enter the nth term of prime no.");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		Assignment28 ob = new Assignment28();
		ob.findNthPrime(n);
		input.close();
	}

}
