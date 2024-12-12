package com.assignement;
// Assignment 91 92 93 
public class StringProgram_ContainsSpecific 
{

	public static void main(String[] args) 
	{
		String name= "manishTiwari";
		System.out.println(name.matches("(.*)n(.*)")); //contains n 
		System.out.println(name.repeat(5)); //repeat 5 times
		System.out.println(name.lastIndexOf('i')); //last index i
		System.out.println(name.indexOf('i')); //just index i
		
	
	}

}
