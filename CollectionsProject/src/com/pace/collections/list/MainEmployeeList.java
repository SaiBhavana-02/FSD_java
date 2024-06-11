package com.pace.collections.list;
import java.util.ArrayList;
public class MainEmployeeList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float sum=0;
		Employee Harshitha=new Employee(1254,"Harshitha",10254.25f);
		Employee Kruthi=new Employee(1254,"Kruthi",10254.25f);
		Employee Hasini=new Employee(1254,"Hasini",10254.25f);
		ArrayList<Employee>empList=new ArrayList<Employee>();
		//add employee objects
		empList.add(Harshitha);
		empList.add(Kruthi);
		empList.add(Hasini);
		for(Employee emp :empList) {
			System.out.println(emp.getId());
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		for(Employee emp :empList) {
			sum+=emp.getSalary();
		}
		System.out.println(sum);
		}
}
