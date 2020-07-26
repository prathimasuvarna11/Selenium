package com.selenium;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		System.out.println("test");
		List<String> list=new ArrayList<String>();
		
		list.add("Priti");
		list.add("Priti");
		list.add(2,"123");
		list.add("Priti2");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
