package com.pace.collections.set;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>citySet=new HashSet<String>();
		citySet.add("Hyderabad");
		citySet.add("Pune");
		citySet.add("Benguluru");
		citySet.add("Hyderabad");
		
		for(String city:citySet) {
			System.out.println(city);
		}
	}

}
