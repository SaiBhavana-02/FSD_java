
public class ManagerExe extends Employeee {
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double salary;
	public ManagerExe(long id,String name,String address,long phone,double salary) {
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
	public void calculateTransportAllowance() {
		double transportAllowance = 15*basicSalary/100;
		System.out.println(transportAllowance);
	}
}
 