import java.util.Scanner;
import java.util.*;
public class StringPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,newStr="";
		char ch;
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter String: ");
		str=scnr.next();
		for(int i=0;i<str.length();i++) {
			ch=str.charAt(i);
			newStr=ch+newStr;
		}
		System.out.println(newStr);
		if(str.equals(newStr)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrome");
		}
	}
}
