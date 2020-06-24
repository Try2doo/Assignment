package Day1;



public class Assignment8 {
	public void tcovert(String tt, int tem) {

		if (tt.equalsIgnoreCase("F")) {

			float ccTemp = (float) ((tem - 32) * 0.555);
			System.out.println("Temperature in celsius= " + ccTemp);
		} else if (tt.equalsIgnoreCase("C")) {

			float ffTemp = (float) ((tem * 1.8 + 32));
			System.out.println("Temperature in Fahrenheit= " + ffTemp);

		}

		
	}

}
