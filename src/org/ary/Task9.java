package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task9 {
	public static void main(String[] args) {
		List<Object>li=new ArrayList<Object>();
		li.add(100);
		li.add(200);
		li.add(300);
		li.add(400);
		li.add(500);
		li.add(600);
		li.add(700);
		
		li.set(2, 350);
		System.out.println(li);
		
	}

}
