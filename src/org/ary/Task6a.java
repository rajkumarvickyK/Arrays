package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task6a {
	public static void main(String[] args) {
	List<Object> li=new ArrayList<Object>();
	li.add(100);
	li.add(200);
	li.add(300);
	li.add(400);
	li.add(500);
	li.add(600);
	li.add(700);
	
	for (int i = 4; i < li.size(); i++) {
		Object obj = li.get(i);
		System.out.println(obj);
		
	}
	}

}
