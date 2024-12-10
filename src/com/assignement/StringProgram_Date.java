package com.assignement;

//"Assignment 98 Write a program to find out Current time Future Time Past time"

import java.util.Date;
public class StringProgram_Date 
{
	public static void main(String[] args) 
	{
		Date d1= new Date();
		System.out.println(d1.getTime()); // current time

		//www.epochconverter.com/
		
		Date d2= new Date(d1.getTime());
		System.out.println(d2); // Current time
		
		Date d3= new Date(d1.getTime() +(1000*60*60*24*1));
		System.out.println(d3); // Future time

		Date d4= new Date(d1.getTime() -(1000*60*60*24*1));
		System.out.println(d4); // Past time

		
		String humantime= d2.toString();
		String month= humantime.substring(4, 7);
		System.out.println(month);// get only month
		
		String year= humantime.substring(humantime.length()-4);
		System.out.println(year); // only year

				


	
	
	
	}

}
