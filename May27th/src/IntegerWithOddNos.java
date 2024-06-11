import java.util.Scanner;
public class IntegerWithOddNos {
	public void oddDigits(int num) {
		int r=0,count=0;
		while(num!=0) {
			r=num%10;
			if(r%2==0) {
				count=1;
				break;
			}
			num=num/10;
		}
		if(count==0) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}
	public static void main(String[] args) {
		int num;
		Scanner scnr=new Scanner(System.in);
		num=scnr.nextInt();
		IntegerWithOddNos od=new IntegerWithOddNos();
		od.oddDigits(num);
	}
}

