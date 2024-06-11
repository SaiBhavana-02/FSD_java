import java.util.Scanner;
public class SumOfParticularElements {

	public static void main(String[] args) {
		float sum=0;
		float arr[]=new float[15];
		Scanner scnr=new Scanner(System.in);
		for(int index=0;index < arr.length; index++) {
			//sum= arr[index]  + arr[arr.length-1];
			System.out.println("Enter element "+index);
			arr[index]=scnr.nextFloat();
		}
		for(int index = 0; index<arr.length; index++) {
			sum = arr[0] + arr[arr.length-1] + arr[arr.length/2] + arr[(arr.length/2)-1] +arr[(arr.length/2)+1] +arr[(arr.length/2)+2];
		}
		System.out.println(sum);
	}

}
