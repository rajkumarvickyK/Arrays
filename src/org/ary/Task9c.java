package org.ary;

import java.util.ArrayList;
import java.util.List;

public class Task9c {public static void main(String[] args) {
	List<Object>li=new ArrayList<Object>();
	li.add(10);
	li.add(20);
	li.add(30);
	li.add(90);
	li.add(10);
	li.add(10);
	li.add(40);
	li.add(50);
	li.add(10);
	
	li.set(0,100);
	li.set(4, 100);
	li.set(5, 100);
	li.set(8, 100);
	System.out.println(li);
	
	
}

}
