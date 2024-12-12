package com.assignement;
//Assignment 82
import java.util.Arrays;

public class ArrayProgram_Reverse 
{

	public static void main(String[] args) 
	{
		int input[]=new int[5];
		input[0]=5;
		input[1]=8;
		input[2]=16;
		input[3]=20;
		input[4]=5;
		int output[]=new int[input.length];//or write 5
		
		for(int i=0,k=input.length-1;i<input.length;i++,k--)// after i=0 give comma
			
		{
			output[k]=input[i];
		}
		
		System.out.println(Arrays.toString(input));
		System.out.println(Arrays.toString(output));
		
		int age[]= new int[4];
		age[0]= 10;
		age[1]= 30;
		age[2]= 50;
		age[3]= 90;
		
		System.out.println(Arrays.toString(age));
		
		int age1[]= new int [4];
		for(int i=0, j=3; i<4; i++, j--)
		{
			age1[j]= age[i];
		}
		System.out.println(Arrays.toString(age1));
		
	}

}
