package co.grandcircus;

import java.util.Scanner;

public class regex {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String choice = null;
		String regexChoice = null;
		String ans = null;

		do {
			
			System.out.print("What are you validating?\n1. Name\n2. Email\n3. Phone number\n4. Date\nAnswer: ");
			
			switch (scan.nextInt()) {

			case 1:
				choice = "name";
				regexChoice = "(^[A-Z][a-z]{0,29})";
				break;
			case 2:
				choice = "email";
				regexChoice = "([a-zA-Z0-9]{5,30}[@][a-zA-Z0-9]{5,10}[.][a-z]{2,3})";
				break;
			case 3:
				choice = "phone number";
				regexChoice = "([0-9]{3}[-][0-9]{3}[-][0-9]{4})";
				break;
			case 4:
				choice = "date";
				regexChoice = "([0-3][0-9][/][0-1][0-9][/][0-9]{4})";
				break;
			default:
				System.out.println("Sean.");
			}
			System.out.println();
			System.out.print("Enter " + choice + " to validate: ");
			scan.nextLine();
			String input = scan.nextLine();
			if (isValid(input, regexChoice)) {

				System.out.println(choice + " is valid.");

			} else {

				System.out.println("invalid " + choice + ".");

			} 
			
			System.out.println("Again? (y/n)");
			ans = scan.nextLine();
			
		} while (ans.equalsIgnoreCase("y"));
		
		scan.close();

	}

	public static boolean isValid(String input, String regex) {

		return input.matches(regex);

	}

}
