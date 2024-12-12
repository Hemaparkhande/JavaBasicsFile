package Viva_Manish;

import java.util.Arrays;

public class AverageArray {

	public static void main(String[] args) 
	{
		int age[]= new int[4];
		age[0]=10;
		age[1]=20;	
		age[2]=30;
		age[3]=60;
		double sum= 0;
		for(int i=0; i<age.length; i++)
		{
			sum=sum + age[i];
		}
		
		System.out.println(sum);
		double average = sum/age.length;
		System.out.println(average);
	}

}
