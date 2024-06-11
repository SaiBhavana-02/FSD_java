
public class Prime {
	boolean isPrime=true;
	boolean notPrime=false;
	int num,count=0;
	public void primeNo(int num) {
		byte count=0;
		for(int counter=2;counter<num;counter++) {
			if(num%counter==0) {
				count=1;
				System.out.println(notPrime);
				break;
			}
		}
		if(count==0) {
			System.out.println(isPrime);
		}
	
	}
}
