package org.ary;

import java.util.LinkedList;
import java.util.List;

public class Task4c {
	public static void main(String[] args) {
		List<Object> l =new LinkedList<Object>();
		l.add(100);
		l.add(200);
		l.add(300);
		l.add(400);
		l.add(500);
		l.add(600);
		l.add(700);
		
		int size = l.size();
		System.out.println("length of linkedlist size: " + size);
	}

}
