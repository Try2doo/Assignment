package day2;

import java.util.Scanner;

public class Assignment25 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the nos. of student.");
		int n = input.nextInt();
		int maxScore = 0;
		String studentName="";
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the name of student.");
			String name = input.next();
			System.out.println("Enter the marks Obtained.");
			int score = input.nextInt();
			if(score>maxScore) {
				maxScore=score;
				studentName = name;
			}
			
			
		}
		System.out.println("Student with highest score\n"+studentName+"\t"+maxScore);
		input.close();
	}

}
