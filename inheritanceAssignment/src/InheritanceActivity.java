
public class InheritanceActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ManagerExe peter=new ManagerExe(126534,"peter","Chennai India",237844,65000);
		Trainee jack=new Trainee(29846,"Jack","Mumbai India",442085,45000);
		
		System.out.println("Manager Details: ");
		peter.calculateSalary();
		
		System.out.println("Trainee Details: ");
		jack.calculateSalary();
		
		System.out.println("Manager");
		peter.calculateTransportAllowance();
		
		System.out.println("Trainee:");
		jack.calculateTransportAllowance();
	}
}
