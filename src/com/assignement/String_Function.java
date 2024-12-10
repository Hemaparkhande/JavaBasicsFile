package com.assignement;
//Assignment 68
public class String_Function 
{

	public static void main(String[] args) 
	{
		String name= "Hema";
		{
			System.out.println(name.toUpperCase());
			
			String name1=" Hema Sandeep Parkhande";
			System.out.println(name1.toLowerCase());
			System.out.println(name1.trim());//remove spaces before and after
			System.out.println(name1.charAt(3));
			System.out.println(name1.charAt(4));
			System.out.println(name1.indexOf('a'));
			System.out.println(name1.substring(2));//from 2 onwards 
			System.out.println(name1.substring(3,9));//start from 3 but end at 8
			System.out.println(name1.equals("hema"));//
			System.out.println(name1.contains("deep"));
			System.out.println(name1.equalsIgnoreCase("Sandeep"));
			//full name should be there for true

		}

	}

}


