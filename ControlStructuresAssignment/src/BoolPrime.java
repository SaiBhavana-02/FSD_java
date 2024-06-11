import java.util.Scanner;
public class BoolPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter no: ");
		num = scnr.nextInt();
		Prime Bool =new Prime();
		Bool.primeNo(num);
	}

}
