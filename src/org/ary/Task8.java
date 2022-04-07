package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task8 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		li.add(2,50);
		System.out.println(li);
	}

}
