package com.assignement;
//Assignment 88, 89 and 90

public class String_CheckSpecific 
{

	public static void main(String[] args) 
	{
		String name="axe";
		boolean b1 = name.matches("...");
		System.out.println(b1);
		System.out.println(name.matches("a.(.*)"));//starts with a
		System.out.println(name.matches("a.."));
		System.out.println(name.matches("(.*)e"));//ends with e
//		System.out.println(name.matches("a.(.*)"));
		
	}

}
