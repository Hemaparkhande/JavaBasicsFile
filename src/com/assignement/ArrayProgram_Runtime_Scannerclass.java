package com.assignement;//Assignment 76

import java.util.Arrays;

import java.util.Scanner;

public class ArrayProgram_Runtime_Scannerclass 
{

		public static void main(String[] args) 
		{
		Scanner s1=new Scanner(System.in);
			int rollno []= new int[4];
		for(int i=0;i<=3;i++)
			{
				System.out.println("Enter the value of index->>"+i);
					rollno[i]=s1.nextInt();
			}
			
			System.out.println(Arrays.toString(rollno));

		}
	}
