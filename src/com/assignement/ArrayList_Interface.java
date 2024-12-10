package com.assignement;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.ListIterator;

public class ArrayList_Interface 
{

	public static void main(String[] args) 
	{
		ArrayList a1= new ArrayList();
		a1.add(10);
		a1.add(2000);
		a1.add(null);
		a1.add(null);
		a1.add("Hema");
		a1.add("Hema");
		System.out.println(a1);
		Iterator i1= a1.iterator();
		System.out.println("Using Iterator Only forward iteration: ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		ListIterator i2= a1.listIterator();
		System.out.println("Using ListIterator forward iteration:");
		while(i2.hasNext())
		{
			System.out.println(i2.next());
		}
		System.out.println("Using ListIterator backward iteration:");
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());
		}
	}

}
