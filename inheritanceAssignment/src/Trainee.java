
public class Trainee extends Employeee{
	long employeeId;
	String employeeName;
	String employeeAddress;
	long employeePhone;
	double salary;
	public Trainee(long id,String name,String address,long phone,double salary) {
		super(id,name,address,phone);
		this.basicSalary=salary;
	}
}
