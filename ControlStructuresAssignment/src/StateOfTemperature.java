
public class StateOfTemperature {
	public void Condition(int temp) {
		if(temp==0 || temp==100) {
		switch(temp) {
		case 0:
			System.out.println("Ice");
			break;
		case 100:
			System.out.println("Steam");
		}
		}
		else if(temp>0 && temp<100) {
			System.out.println("Water");
		}else {
			System.out.println("Invalid");
		}
	}
}
