package com.assignement;
//"Assignment 99 write a program on add method in the Collection class with Homogeneous Values."
//"Assignment 100 Write a Program on add method in the collection class with hetrogeneous Values."
//"Assignment 101 write a program on add All method in the Collection class ."
//"Assignment 102 Write a Program on Clear method in the collection class."
//"Assignment 103 write a program on isempty method in the Collection class."
import java.util.ArrayList;

import java.util.Collection;
public class CollectionInterface_Add_Clear_isEmpty 
{
	public static void main(String[] args) 
	{	Collection c1= new ArrayList();
		c1.add("mango");
		c1.add("banana");
		c1.add("cat");
		c1.add("fish");
		c1.add('A');
		c1.add(100);
		c1.add(1.2);
		c1.add(true);
		System.out.println(c1);
		Collection c2= new ArrayList();
		c2.addAll(c1);
		c2.add("Good");
		c2.add("Bad");
		System.out.println(c2);
		c2.clear();
		System.out.println(c2);
		boolean b1= c2.isEmpty();
		System.out.println(b1);
		boolean b2= c1.isEmpty();
		System.out.println(b2);
	}

}
