import java.util.Scanner;

public class Cases {

	public static void main(String[] args) {
		int choice;
		Scanner scnr=new Scanner(System.in);
		while(true) {
			System.out.println("1.Enter text to write to the file    2.Exit\n");
			choice=scnr.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter text: ");
				System.out.println(scnr.next());
			case 2:
				System.exit(0);
			}
		}
	}
} 