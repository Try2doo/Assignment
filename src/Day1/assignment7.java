package Day1;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class assignment7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the radius and length of cylinder.");
		double r = input.nextDouble();
		double l = input.nextDouble();
		double vol = 2*Math.PI*r*r*l;
		System.out.println("Volumn of cylinder:"+vol);
	
		
		JOptionPane.showMessageDialog(null, "Volumn of cylinder:"+vol);
		input.close();
	}

}
