package com.assignement;
//Assignment 69
public class Reverse_String 
{
	public static void main(String[] args) 
	{
		String input= "Parkhande";
		String output="";
		
		for (int i=input.length()-1;i>=0;i--)
		{
			char c= input.charAt(i);
			output=output+c;
		}
		System.out.println(output);

	}

}
// i=9
//c1=e
//output=e
//i=8
//c1=d
//de