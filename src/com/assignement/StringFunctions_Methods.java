package com.assignement;
//Assignment 79
public class StringFunctions_Methods 
{
	public static void main(String[] args) 
	{
		String name=" Hema Sandeep Parkhande";		
		{
			System.out.println(name.length());
			System.out.println(name.toUpperCase());
			System.out.println(name.toCharArray());
			System.out.println(name.charAt(2));
			System.out.println(name.endsWith("Hema"));
			System.out.println(name.equals("Hema"));
			System.out.println(name.equalsIgnoreCase("Hema"));
			System.out.println(name.indexOf('d'));//9
			System.out.println(name.lastIndexOf('P'));// count from 1st letter
			System.out.println(name.toString());//name itself
			System.out.println(name.substring(3));
			System.out.println(name.trim());
			System.out.println(name.substring(2,8));//end at 7
			System.out.println(name.contains("Par"));
			System.out.println(name.replace('e', 'z'));
			System.out.println(name.replace("Hema", "Aayush"));
			System.out.println(name.replaceAll("[A-Z]", ""));
			System.out.println(name.replaceAll("[a-z]", ""));

			String name1=" 2024 Hema Sandeep Parkhande";	
			System.out.println(name1.replaceAll("[0-9]", ""));
			System.out.println(name1.toCharArray());

			
				//full name should be there for true
			
		}
	}

}
