import java.util.Scanner;
public class Swapping2Var {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter x:");
		int x=scnr.nextInt();
		System.out.println("Enter y:");
		int y=scnr.nextInt();
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x is: "+x);
		System.out.println("y is: "+y);
	}

}
