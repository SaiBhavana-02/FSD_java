
public class SumOfElements {
	public static void main(String[] args) {
		float[] prices = {563.24f,953.26f,789.25f,685.24f,574.45f,543.45f};
		//we can keep the square braces anywhere before"=",this is called initialized list or initialized array elements
		System.out.println(prices.length);
		//here array name is called instance constant
		float sum=0.0f;
		for(int index = 0;index < prices.length;sum+=prices[index],index++); {
			//sum += prices[index];
		}
		System.out.println("The Original array: ");
		for(int index = 0;index < prices.length;index++) {
			System.out.println(prices[index]);
		}
		for(float price: prices) {
			System.out.println(price);
		}
		System.out.println("Sum of array elements: "+sum);
		for(;;) {
			//with a condition return true the control will no going to body of the loop
			System.out.println("Hi");
		}
	}
}
//the max size of int datatype is max size of the array
