import java.util.LinkedHashMap;
import java.util.Scanner;

public class SuperMarket {

	public static void main(String[] args) {
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter num:");
		int num=scnr.nextInt();
		scnr.nextLine();
		LinkedHashMap<String,Integer>ITEM_PRICE=new LinkedHashMap<>();
		for(int i=0 ;i<num; i++) {
			System.out.println("Enter String: ");
			String[] input=scnr.nextLine().split(" ");
			String ITEM_NAME=input[0];
			int price=Integer.parseInt(input[1]);
			ITEM_PRICE.put(ITEM_NAME,price);
		}
		
		while(scnr.hasNext()) {
			String ITEM_NAME=scnr.next();
			int quantity=scnr.nextInt();
			if(ITEM_PRICE.containsKey(ITEM_NAME)) {
				int netPrice=quantity*ITEM_PRICE.get(ITEM_NAME);
				System.out.println(ITEM_NAME+" "+netPrice);
			}
		}
		scnr.close();
	}
}
