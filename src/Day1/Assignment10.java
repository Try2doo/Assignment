package Day1;

import javax.swing.JOptionPane;

public class Assignment10 {

	public static void main(String[] args) {
		// s=u*t+0.5*a*t*t
		Object[] possibleValues = { "Distance Taravelled", "Area of Triangle", "Roots of Equation" };
		String selectedValue = String.valueOf(JOptionPane.showInputDialog(null, "Select the option from below: ", "Calculate the Areas", JOptionPane.QUESTION_MESSAGE,null,possibleValues, possibleValues[0]));


		if (selectedValue.equals(possibleValues[0])) {
			double u = Double.parseDouble(JOptionPane.showInputDialog("Enter Initial velocity:"));
			double t = Double.parseDouble(JOptionPane.showInputDialog("Enter Time:"));
			double a = Double.parseDouble(JOptionPane.showInputDialog("Enter Acceleration:"));
			double s = u * t + 0.5 * a * t * t;
			JOptionPane.showMessageDialog(null, "Distance Travelled s=" + s);

		} else if (selectedValue.equals(possibleValues[1])) {

			double a = Double.parseDouble(JOptionPane.showInputDialog("Enter First side:"));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Enter Second side:"));
			double c = Double.parseDouble(JOptionPane.showInputDialog("Enter Third side:"));
			double s = a + b + c;
			double aTri = Math.sqrt(s * (s - a) * (s - b) * (s - c));
			JOptionPane.showMessageDialog(null, "Area of Triangle A=" + aTri);

		} else if(selectedValue.equals(possibleValues[2])) {
			double a = Double.parseDouble(JOptionPane.showInputDialog("Enter value of a:"));
			double b = Double.parseDouble(JOptionPane.showInputDialog("Enter value of b:"));
			double c = Double.parseDouble(JOptionPane.showInputDialog("Enter value of c:"));
			double x = (-b + Math.sqrt(b * b + 4 * a * c)) / (2 * a);
			JOptionPane.showMessageDialog(null, "Area of Triangle A=" + x);

		}else {
			JOptionPane.showMessageDialog(null, "You have cancelled");
		}

	}
}
