package com.assignement;

//"Assignment 104 write a program on Contains method in the Collection class."
//"Assignment 105 write a program on Contains All method in the Collection class."
//"Assignment 106 write a program on Remove method in the Collection class.""
//Assignment 107 "write a program on Remove All method in the Collection class.

import java.util.ArrayList;
import java.util.Collection;

public class CollectionInterface_Contains_Remove 
{
	public static void main(String[] args) 
	{
		Collection c1= new ArrayList();
		c1.add("cat");
		c1.add("fish");
		c1.add("Good");
		System.out.println(c1);
		Collection c2= new ArrayList();
		c2.addAll(c1);
		c2.add('A');
		c2.add(1.3);
		System.out.println(c2);
		System.out.println(c1.contains("tiger"));
		System.out.println(c2.containsAll(c1));
		
		c1.remove("cat");
		System.out.println(c1);
		c2.removeAll(c1);
		System.out.println(c2);
		
	}

}
