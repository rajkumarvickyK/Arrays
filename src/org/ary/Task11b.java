package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task11b {
	public static void main(String[] args) {
		List<Integer> li= new ArrayList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		li.add(60);
		li.add(70);
		li.add(80);
		
		List<Integer> l= new ArrayList<>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		l.add(800);
		
		l.removeAll(li);
		System.out.println(l);
	}	
}
