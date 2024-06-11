import java.util.Scanner;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter no: ");
		temp = scnr.nextInt();
		StateOfTemperature State=new StateOfTemperature();
		State.Condition(temp);
	}

}
