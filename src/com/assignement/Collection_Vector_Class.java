package com.assignement;

import java.util.Collections;
import java.util.Vector;

public class Collection_Vector_Class 
{

	public static void main(String[] args) 
	{
		Vector a1 = new Vector();
		a1.add(10);
		a1.add(2000);
		a1.add(100);
		a1.add(0);
		/*a1.add(null);
		a1.add(null);
		a1.add("Hema");
		a1.add("Hema");
		a1.add(99);*/
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);

		
		
	}

}
