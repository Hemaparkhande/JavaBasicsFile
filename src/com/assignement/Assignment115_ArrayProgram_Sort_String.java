package com.assignement;
import java.util.ArrayList;
import java.util.Collections;

public class Assignment115_ArrayProgram_Sort_String 
{

	public static void main(String[] args) 
	{
		ArrayList <String> a1= new ArrayList <String>();
		a1.add("cat");
		a1.add("dog");
		a1.add("tree");
		a1.add("fish");
		a1.add("good");
		System.out.println(a1);
		
		Collections.sort(a1); //sorts alphabetically
		System.out.println(a1);
		
	}

}
