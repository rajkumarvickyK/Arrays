package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task10 {
	public static void main(String[] args) {
		List<Object> li=new ArrayList<>();
		
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		List<Object> l=new ArrayList<>();
		
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(80);
		
		l.retainAll(li);
		System.out.println(l);
	}

}
