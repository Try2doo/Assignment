package project1;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		
		Resturant ob = new Resturant();
		Scanner input = new Scanner(System.in);
		String decision = "";
		Resturant.displayMainMenu();
		do {
			
		
			System.out.println("Chose any meal.");
			String choice = input.next();
			switch(choice) {
			case "1":
				Resturant.displayItalianFoodMenu();
				do {
					System.out.println("\nWHICH FOOD YOU WANT TO EAT TODAY? ");
					choice =input.next();
					
					int people = input.nextInt();
					int ttray;
					switch (choice) {
					case "1":
						System.out.println("Lasagna Tray. - Feeds 5");		
						System.out.println("For "+people+" you need "+ttray);
					case "2":
						System.out.println("Pizza Pack. - Feeds 5");						
						System.out.println("For "+people+" you need "+ttray);
					case "3":
						System.out.println("Lasagna Tray. - Feeds 5");
						System.out.println("For "+people+" you need "+ttray);
					}
					System.out.println("For how many people?");
					ttray = Resturant.determineTrays(people, 5);;
					
				}while();
				break;
			case "2":
				Resturant.displayChineseFoodMenu();
				System.out.println("\nWHICH FOOD YOU WANT TO EAT TODAY? ");
				do {
					
				}
				break;
			case "3":
				Resturant.displayAmericanFoodMenu();
				System.out.println("\nWHICH FOOD YOU WANT TO EAT TODAY? ");
				break;
			default:
				System.out.println("Wong Order!!!");

			}
			
			System.out.println("\nGO TO MAIN MENU - YES/NO");
			decision = input.next();
		
		
		}while(decision.equalsIgnoreCase("yes"));
		System.out.println("");
		System.out.println("THANK YOU !!!");
		
		
		
		input.close();
		
		
		
	} 
		
}


