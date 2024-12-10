package com.assignement;
import java.util.ArrayList;
import java.util.Collections;
public class Assignment114_ArrayProgram_Sort 
{

	public static void main(String[] args) 
	{
		ArrayList<Integer> a1= new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(100);
		a1.add(0);
		a1.add(99);
		System.out.println(a1);
		Collections.sort(a1);
		System.out.println(a1);
		
		
	}

}
