package com.assignement;

public class Arrayprogram_Average 
{

	public static void main(String[] args) 
	{
		double value[]=new double[5];
		
		value[0]=5;
		value[1]=8;
		value[2]=16;
		value[3]=20;
		value[4]=5;
		double sum=0;
		
		
		
		for(int i=0;i<value.length;i++)
		{
			sum=sum+value[i];
		}
		System.out.println(sum);
		double average= sum/value.length;
		System.out.println(average);



	}

}
