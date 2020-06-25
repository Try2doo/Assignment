package project1;

public class Resturant {
	public static void displayMainMenu() {
		System.out.println(" CHOSE TYPE OF MEAL ");
		System.out.println("______________________");
		System.out.println("\t1. ITALIAN");
		System.out.println("\t2. CHINESE");
		System.out.println("\t3. AMERICAN");
		

	}
	public static void displayItalianFoodMenu() {
		/*	1. Lasagna Tray - Feeds 5 - 17.99
			2. Pizza Pack - Feeds 7 - 15.99
			3. Gazpacho Soup, salad and bread sticks pack - Feeds 4 - 12.99 */
		System.out.println("1. Lasagna Tray."+"\n  Feeds 5 - 17.99");
		System.out.println("2. Pizza Pack."+"\n Feeds 7 - 15.99");
		System.out.println("3. Gazpacho Soup, salad and bread sticks pack."+"\n  Feeds 4 - 12.99");
		
	}
	public static void displayChineseFoodMenu() {
		/*	1. Chicken and Broccoli Tray (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99
			2. Sweet and Sour Pork Tray (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99
			3. Shrimp Fried Rice Tray (includes 10 egg rolls) - Feeds 5 - 10.99 */
		System.out.println("1. Chicken and Broccoli Tray."+"\n (includes 7 wonton soups, 7 egg rolls) - feeds 7 - 18.99");
		System.out.println("2. Sweet and Sour Pork Tray."+"\n (includes 7 hot and sour soups, 7 egg rolls) - feeds 7 - 18.99");
		System.out.println("3. Shrimp Fried Rice Tray."+"\n (includes 10 egg rolls) - Feeds 5 - 10.99");
	}
	public static void displayAmericanFoodMenu() {
		/* 	1. Hamburger and Hot Dog Tray - includes buns and condiments - feeds 8 - 21.99
		   	2. Grilled Chicken Sandwich and Mozzarella Sticks Tray - includes dipping sauces -Feeds 5 -22.99
		   	3. Barbeque Tray - includes buns and peach cobbler - Feeds 10 - 26.99 */
		System.out.println("1. Hamburger and Hot Dog Tray."+"\n includes buns and condiments - feeds 8 - 21.99");
		System.out.println("2. Grilled Chicken Sandwich and Mozzarella Sticks Tray."+"\n includes dipping sauces -Feeds 5 -22.99");
		System.out.println("3. Barbeque Tray."+"\n includes buns and peach cobbler - Feeds 10 - 26.99");
	}
	public static int determineTrays(int people, int feeds) {
		int tray=0;
		tray = people/tray;
		
		if (people/tray==0) {
			return tray;
		}else
			tray= people/tray +1;
			return tray;
		}

	
	
}


