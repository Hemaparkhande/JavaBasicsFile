package com.assignement;
//Assignment 78
import java.util.Arrays;

public class ArrayProgram_NumberPresent_OrNot 
{

	public static void main(String[] args) 
	{
		int age[]=new int[4];
		age[0]=12;
		age[1]=50;
		age[2]=13;
		age[3]=10;
		
		int givenage=13;
		
for(int i=0;i<=3;i++)
{
	if(givenage==age[i])

	{
		System.out.println("Number is present");
		System.out.println("Indexing of givenage->"+i);

	}
	
}
}
}