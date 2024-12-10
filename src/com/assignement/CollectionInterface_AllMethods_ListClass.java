package com.assignement;
//"Assignment 110 write a program on List Methods from add() to size() in the List Class"
import java.util.Collection;
import java.util.ArrayList;
public class CollectionInterface_AllMethods_ListClass 
{
	public static void main(String[] args) 
	{
		Collection c1= new ArrayList();
		c1.add("cat");
		c1.add(true);
		c1.add("100");
		c1.add('A');
		System.out.println(c1);
		Collection c2= new ArrayList();
		c2.add("Man");
		c2.addAll(c1);
		System.out.println(c2);
		System.out.println(c2.size());
		c2.clear();
		System.out.println(c2);
		boolean b1= c2.isEmpty();
		System.out.println(b1);
		
	System.out.println(c1.contains("cat"));
	System.out.println(c1.containsAll(c2));
	c1.remove("cat");
	System.out.println(c1);
	c2.removeAll(c1);
	System.out.println(c2);
	}

}
