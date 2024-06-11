package com.pace.staticmembers.main;

import com.pace.staticmembers.Customer;

public class MainCustomers {

	public static void main(String[] args) {
		Customer bhavana = new Customer(1234,"Bhavana",698753.25f);
		Customer harshitha = new Customer(1111,"Harshitha",6687453.21f);
		System.out.println( bhavana.getId() + "  " + bhavana.getName() + "  " + 
								bhavana.getBillAmt() );

		System.out.println( harshitha.getId() + "  " + harshitha.getName() + "  " + harshitha.getBillAmt() );
		System.out.println(Customer.companyName);
		System.out.println( bhavana.hashCode());
		System.out.println( harshitha.hashCode()); 
		
		boolean isEqual = bhavana.hashCode()
				== harshitha.hashCode();
		
		System.out.println("nesha and sagar objects are equal ? "  +  isEqual);
		boolean isEqual2 =bhavana.equals(harshitha);
		System.out.println("nesha and sagar objects are equal ? "  +  isEqual2);
		
	//	System.out.println(nesha.toString());
	//	System.out.println(sagar.toString());
		
		System.out.println(bhavana);
		System.out.println(harshitha);
		}

}
