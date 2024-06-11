import java.util.Scanner;
public class AvgOfEvenIndexs {
	public static void main(String[] args) {
		int sum=0,avg = 0,count=0;
		@SuppressWarnings("resource")
		Scanner scnr = new Scanner(System.in);
		float arr[]=new float[10];
		for(int index = 0;index < arr.length;index++) {
			System.out.println("Enter elements: "+index);
			arr[index]=scnr.nextFloat();
		}
		for(int index = 0;index < arr.length ;index=index+2) {
		    sum+=arr[index];
		    count++;
		    avg=sum/count;
		}
		System.out.println(avg);
	}
}
