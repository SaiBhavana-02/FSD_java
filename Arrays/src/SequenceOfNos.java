import java.util.Scanner;
public class SequenceOfNos {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		int arr[]=new int[7];
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter element "+i);
			arr[i]=scnr.nextInt();
		}
		byte flag=0;
		for(int i = 0;i<arr.length;i++) {
			for(int j=1;j<arr.length;j++) {
				for(int k = 2;k<arr.length;k++) {
					if(arr[i]==1 && arr[j]==2 && arr[k]==3) {
						flag=1;
						break;
					}
				}
			}
		}
		if(flag==1) {
			System.out.println("True");
		}else {
			System.out.println("false");
		}
	}

}
