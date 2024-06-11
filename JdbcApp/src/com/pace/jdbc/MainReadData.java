package com.pace.jdbc;
import java.util.Scanner;
public class MainReadData {

	public static void main(String[] args) throws Exception {
		ReadData objects=new ReadData();
		objects.registerDriver();
		objects.getDetails();
	}

}
