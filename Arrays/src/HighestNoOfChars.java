import java.util.Scanner;
public class HighestNoOfChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scnr=new Scanner(System.in);
		String cities[]={"New York", "Los Angeles", "Chicago", "Houston", "Philadelphia"};
		for(int i=0;i<5;i++) {
			System.out.println("Enter city: "+i);
			cities[i]=scnr.nextLine();
		}
		String longestStr="";
		int max=0;
		for(String city:cities) {
			if(city.length()>max) {
				longestStr=city;
				max=city.length();
			}
		}
		System.out.println("Longest String is "+longestStr);
	}

}
