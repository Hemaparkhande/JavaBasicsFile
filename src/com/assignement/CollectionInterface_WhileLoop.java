package com.assignement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//"Assignment 109write a program on While Loop using iteration method(hasNext and Next)"
//"Assignment 108 write a program on Size method in the Collection class."
public class CollectionInterface_WhileLoop 
{
	public static void main(String[] args) 
	{	/*int i=10;
		while(i>3)
		{
			System.out.println(i);
			i--;*/
		Collection c1= new ArrayList();
		c1.add("cat");
		c1.add("fish");
		c1.add("Good");
		System.out.println(c1);
		System.out.println(c1.size());
		
		Iterator i1= c1.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next());

		}
		
		}
	}


