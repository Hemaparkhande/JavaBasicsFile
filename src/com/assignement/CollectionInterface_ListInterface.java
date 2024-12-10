package com.assignement;
//"Assignment 111 write a program on List Interface for ListIterator() of forward Iteration and 
//Backward Iteration and Iterator() also."
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Iterator;
//all methods come from List interface
public class CollectionInterface_ListInterface 
{public static void main(String[] args) 
	{	List l1= new ArrayList();
		l1.add(100);
		l1.add(-200);
		l1.add('A');
		l1.add("tree");
		l1.add(null);
		l1.add(true);
		System.out.println(l1);
//List interface follows indexing,order of insertion,duplicates,null,heterogeneous,dynamic,iterator,List of Iterator
//set interface is opposite of List interface
		Iterator i1= l1.iterator();
		System.out.println("Using Iterator Only forward iteration: ");
		while(i1.hasNext())
		{
			System.out.println(i1.next());
		}
		ListIterator i2= l1.listIterator();
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
