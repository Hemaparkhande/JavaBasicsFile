package com.assignement;

import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.ArrayList;

public class Collection_LinkedList_Class 
{

	public static void main(String[] args) 
	{
		LinkedList a1 = new LinkedList();
		a1.add(10);
		a1.add(2000);
		a1.add(100);
		a1.add(0);
		
		a1.add(99);
		System.out.println(a1);
		/*Collections.sort(a1);
		System.out.println(a1);*/
		ListIterator l1= a1.listIterator();
		System.out.println(l1);



	}

}
