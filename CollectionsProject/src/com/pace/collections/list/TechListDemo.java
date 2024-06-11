package com.pace.collections.list;

import java.util.ArrayList;

public class TechListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>techList=new ArrayList<String>();
		techList.add("java");
		techList.add("React");
		techList.add("Dot Net");
		System.out.println("Original Tech List");
		for(String technology : techList) {
			System.out.println(technology);
		}
		techList.set(2,"Angular");
		//String langStr="Angular";
		//techList.set(2,langStr);
		System.out.println("Tech list after updation");
		for(String technology:techList) {
			System.out.println(technology);
		}
		techList.remove("React");
		//techList after deletion
		System.out.println("Tech list after deletion");
		for(String technology:techList) {
			System.out.println(technology);
		}
	}
}
