package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task6b {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		
		for (int i = 8; i <li.size(); i++) {
			Integer obj = li.get(i);
			System.err.println(obj);
			
			//not in 8th index value
			
		}
	}

}
