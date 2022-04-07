package org.ary;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Task3 {
	public static void main(String[] args) {
		
		Set<Object> s = new LinkedHashSet<>();
		int a[] = {10,10,20,50,60,80,60,50};
		
		//iteratin enhanced for loop
		for (int i : a) {
			s.add(i);
		
			
		}
		System.out.println(s);
	}

}
