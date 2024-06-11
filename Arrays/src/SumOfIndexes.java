import java.util.Scanner;
public class SumOfIndexes {
	public static void main(String[] args) {
		int even=0,odd=0;
		Scanner scnr=new Scanner(System.in);
		float arr[]=new float[10];
		
		for(int index=0;index<arr.length;index++) {
			System.out.println("Enter element: "+index);
			arr[index]=scnr.nextFloat();
		}
		byte flag=0;
		for(int index=0;index<arr.length;index++) {
			if(arr[1]%2==0) {
				flag=1;
				break;
			}
		}
		if(flag==1) {
			for(int index=0;index<arr.length;index=index+2) {
				even+=arr[index];
			}
			System.out.println(even);
		}
		if(flag==0) {
			for(int index=1;index<arr.length;index=index+2) {
				odd+=arr[index];
			}
			System.out.println(odd);
		}
	}
}
