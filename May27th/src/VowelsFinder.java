import java.util.Scanner;
public class VowelsFinder {
	String str;
	int vowel=0;

	public VowelsFinder() {
		Scanner scnr=new Scanner(System.in);
		str=scnr.next();
	}
	public void vowels() {
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u'
					|| str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U') {
				vowel=vowel+1;
			}
		}
	}
	public void displayCount() {
		System.out.println("vowel count is: "+vowel);
	}
	public static void main(String[] args) {
		VowelsFinder vf=new VowelsFinder();
		vf.vowels();
		vf.displayCount();
	}
}
