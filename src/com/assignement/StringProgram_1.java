package com.assignement;

//"Assignment 94 Write a program where Input is""Manish Kumar Tiwari"" Output""MKT"
//"Assignment 95 Write a program where Input is""Manish Kumar tiwari"" Output""M K T"
//"Assignment 97 Write a program using append method in String Buffer"
public class StringProgram_1 
{

	public static void main(String[] args) 
	{	
		String name="Manish Kumar Tiwari";
		String name1= name.replace(" ", "");
		System.out.println(name1.replaceAll("[a-z]", ""));
		//String is immutable
		//OR
		String name3 = name.replaceAll("[a-z]", "").replace(" ", "");
		System.out.println(name3);
		
		for(int i=0; i<name3.length();i++)
		{
			System.out.println(name3.charAt(i));
		}

String name2 = new String ("Automation");
System.out.println(name2);

	StringBuffer s1= new StringBuffer("Mobile");
	s1.append(" is bad");
	System.out.println(s1);
	//StringBuffer is mutable means changeable



	
	}

}
