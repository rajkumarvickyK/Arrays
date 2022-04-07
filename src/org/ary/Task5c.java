package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task5c {
	public static void main(String[] args) {
		List<Object> li = new ArrayList<Object>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		int i = li.indexOf(90);
		System.out.println("Index value of 90: " + i);
		
	}

}
