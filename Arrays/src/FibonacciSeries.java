
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1;
		int arr[]=new int[10];
		//System.out.println(a);
		//System.out.println(b);
		for(int index=0;index<arr.length;index++) {
			//int c=a+b;
			//a=b;
			//b=c;
			//System.out.println(c);
			if(index==0) {
				arr[index]=0;
			}else if(index==1) {
				arr[index]=1;
			}else {
				arr[index]=arr[index-1]+arr[index-2];
			}
		}
		for(int index=0;index<arr.length;index++) {
			System.out.println(arr[index]);
		}
	}

}
