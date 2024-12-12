package com.assignement;

import java.util.Collections;
import java.util.LinkedHashSet;

public class Collection_LinkedHashSet_Class 
{

	public static void main(String[] args) 
	{
		LinkedHashSet a1=new LinkedHashSet();
		a1.add(10);
		a1.add(2000);
		a1.add(100);
		a1.add(0);
		a1.add(null);
		a1.add(null);// only one null, indexing LinkedHashSet but not hashset

		a1.add(100000);
		a1.add(3);
		a1.add(10000);
		a1.add(2000000);
		a1.add(1);
		a1.add(99);
		
		System.out.println(a1);
		

	}

}
