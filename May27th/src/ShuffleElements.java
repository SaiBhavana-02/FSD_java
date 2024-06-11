
public class ShuffleElements {
	public void reverseArray() {
	int[] arr1={5,9,6,8,7,3};
	int[] arr2=new int[6];
	int j=0;
	for(int i=arr1.length-1;i>=0;i--) {
		arr2[j]=arr1[i];
		j++;
	}
	for(int index:arr2) {
		System.out.print(index);
	}
	}
	public static void main(String[] args) {
		ShuffleElements se=new ShuffleElements();
		se.reverseArray();
	}
}
