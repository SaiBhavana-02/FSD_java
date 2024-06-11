
public class SalesCommission {
	double salesamnt,commission;
	public SalesCommission(double salesamnt) {
		this.salesamnt=salesamnt;
	}
	public void minSales() {
		commission=500;
		System.out.println("Commission is:"+commission);
	}
	public void aboveMin() {
		commission=500+(salesamnt-10000)*10/100;
		System.out.println("Commission is:"+commission);
	}
	public void maxSales() {
		commission=500+2000*10/100+(salesamnt-12000)*15/100;
		System.out.println("Commission is:"+commission);
	}
	public void aboveMax() {
		commission=500+2000*10/100+3000*15/100+(salesamnt-15000)*20/100;
		System.out.println("Commission is:"+commission);
	}
	
}
