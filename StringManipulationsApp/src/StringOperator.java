
public class StringOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Life is Beautiful";
		String str2 = new String("Life is beautiful");
		System.out.println(str.length());
		char ch=str.charAt(1);
		System.out.println(ch);
		//substring
		String substr=str.substring(5,7);
		System.out.println(substr);
		//Life is beautiful folks
		String concatStr=str.concat(",folks");
		System.out.println(concatStr);
		
		//finding no of spaces
		int counter=0;
		for(int index=0 ; index < str.length(); index++) {
			char space = str.charAt(index);
			if(space==' ') {
				counter++;
			}
		}
		System.out.println("Number of spaces = "+counter);
	}
}
