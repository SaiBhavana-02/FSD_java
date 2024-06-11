import java.util.Scanner;
public class MenuDrivenApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//we know that do-while will execute atleast for once (purpose: The information about the application to perform various operations can be provided within do-while loop,if the user wants to continue the application any one of the options can be selected otherwise the options window can be exited) eg: menu driven application
		float num1,num2,result=0;
		int choice;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter the 1st no");
		num1 = scnr.nextFloat();
		System.out.println("Enter the 2nd no");
		num2 = scnr.nextFloat();
		do {
			System.out.println("Enter your choice: 1.Add 2.Subtract 3.Multiply 4.Divide");
			choice = scnr.nextInt();
			switch(choice) {
			case 1:
				result = num1 + num2;
				break;
			case 2:
				result = num1 - num2;
				break;
			case 3:
				result = num1 * num2;
				break;
			case 4:
				result = num1 / num2;
				break;
				
			}
			System.out.println("Result:" +result);
		} while(choice!=5);

	}

}
