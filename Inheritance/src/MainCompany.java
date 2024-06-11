
public class MainCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee harshitha= new Employee(1452,"Harshitha","Developer",24563.25f);
		Manager bhavana=new Manager(145875,"Bhavana","Tech Manager",56321.25f,25);
		System.out.println("Employee Details");
		harshitha.showDetails();
		System.out.println("Manager Details");
		bhavana.getDetails();
		harshitha.computeHra();
		bhavana.computeHra();
	}
}
//same method signature in super class and subclass with different business logic in super class and also in subclass
//eg:employee hra is 20% of salary manager hra is 40% salary