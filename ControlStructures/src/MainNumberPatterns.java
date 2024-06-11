import java.util.Scanner;
public class MainNumberPatterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		NumberPatterns Display=new NumberPatterns();
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter no: ");
		num = scnr.nextInt();
		Display.pattern();
	}

}
