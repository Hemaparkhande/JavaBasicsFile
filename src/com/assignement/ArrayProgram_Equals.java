package com.assignement;
import java.util.Arrays;
import java.util.Scanner;
//Assignment 77
public class ArrayProgram_Equals 
{
	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);		
			int age[]=new int[5];
			int age1[]=new int[5];
		for(int i=0;i<=4;i++)
		{
			System.out.println("Enter the value of index->>"+i);
			age[i]= s1.nextInt();
			age1[i]= s1.nextInt();
		}
		System.out.println(Arrays.toString(age));
		System.out.println(Arrays.toString(age1));
	boolean b1=	Arrays.equals(age, age1);
	System.out.println(b1);

	if(b1==true)
	{
		System.out.println("Arrays are equals");
	}
	else
	{
		System.out.println("Arrays are not equals");
	}
	}

}
