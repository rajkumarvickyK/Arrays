package org.ary;

import java.util.List;
import java.util.Vector;

public class Task4b {
	public static void main(String[] args) {
		
		List<Object> li = new Vector<>();
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		
		int size = li.size();
		System.out.println("length of vector size: " + size);
	}

}
