import java.util.Scanner;
public class LargestArrayElement {

	public static void main(String[] args) {
		float large;
		Scanner scnr=new Scanner(System.in);
		//declare the array
		float marks[]=new float[3];
		//for(float mark:marks) {
			//System.out.println(mark);
		//}
		//read value into array
		for(int index=0;index < marks.length;index++) {
			System.out.println("Enter mark for index "+index);
			marks[index]=scnr.nextFloat();
		}
		large=marks[0];
		for(int index=1;index < marks.length;index++) {
			if(marks[index]>large) {
				large=marks[index];
			}
		}
		System.out.println("largest value"+large);
	}

}
