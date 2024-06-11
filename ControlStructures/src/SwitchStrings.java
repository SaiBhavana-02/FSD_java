import java.util.Scanner;

public class SwitchStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String country;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter USA or UK");
		country = scnr.next();
		switch(country) {
		// placing default at 1st or end is not mandatory,we can keep it anywhere.
		default:
			System.out.println("Ivalid country");
			break;
		case "USA":
		case "usa":
			System.out.println("United States Of America");
			break;
		case "UK":
		case "uk":
			System.out.println("United Kingdom");
			break;
		}

	}

}
