package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task11 {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(90);
		li.add(10);
		li.add(10);
		li.add(40);
		li.add(50);
		
		List<Integer>l = new ArrayList<>();
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		l.add(80);
		
		l.removeAll(li);
		System.out.println(l);
		
	}

}
