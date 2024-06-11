
public class Manager extends Employee {
	int teamSize;
	public Manager(int id, String name, String job, float salary,int teamSize) {
		super(id, name, job, salary);
		this.teamSize=teamSize;
		// TODO Auto-generated constructor stub
	}
	public void getDetails() {
		super.showDetails();
		System.out.println(teamSize);
	}
	public void computeHra() {
		hra=salary*(20/100);
		System.out.println("Hra of Manager: "+hra);
	}
}
//subclass constructor should pass the values to super class constructor