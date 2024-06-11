import java.util.HashSet;
import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter no.of students: ");
		int n=scnr.nextInt();
		System.out.println("Enter no.of columns: ");
		int nclmns=scnr.nextInt();
		//String names=scnr.nextLine();
		HashSet<String>columns=new HashSet<String>();
		System.out.println("Enter column names: ");
		for(int i=0;i<nclmns;i++) {
			columns.add(scnr.next());
		}
		float sum=0,marks,avg=0;
		System.out.println("Enter marks: ");
		for(int i=0;i<n;i++) {
			marks=scnr.nextFloat();
			sum+=marks;
		}
		avg=sum/n;
		System.out.println(avg);
	}

}
