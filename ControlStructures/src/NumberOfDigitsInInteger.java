import java.util.Scanner;
public class NumberOfDigitsInInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr = new Scanner(System.in);
		int num,rem,counter=0;
		System.out.println("Enter the num");
		num = scnr.nextInt();
		if(num==0) {
			counter++;
		}
		while(num!=0) {
			rem=num%10;
			counter=counter+1;
			num=num/10;
		}
		System.out.println(counter);
		//if you want to check for 001 take it as string 
	}

}
