package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task6c {
	public static void main(String[] args) {

		List<Object> li=new ArrayList<Object>();
		
		li.add(105);
		li.add(205);
		li.add(305);
		li.add(405);
		li.add(505);
		li.add(605);
		li.add(705);
		li.add(805);
		
		for (int i = 0; i < li.size(); i++) {
			Object obj = li.get(i);
			System.out.println(obj);
		}
	}
}
