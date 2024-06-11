import java.util.Scanner;

public class MainSalesCommission {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salesamnt;
		Scanner scnr = new Scanner(System.in);
		System.out.println("Enter sales amount: ");
		salesamnt = scnr.nextDouble();
		SalesCommission Cmssn = new SalesCommission(salesamnt);
		if(salesamnt>0 && salesamnt<10001) {
			Cmssn.minSales();
		}if(salesamnt>10000 && salesamnt<12001) {
			Cmssn.aboveMin();
		}if(salesamnt>12000 && salesamnt<15001) {
			Cmssn.maxSales();
		}if(salesamnt>15000) {
			Cmssn.aboveMax();
		}
	}
}
