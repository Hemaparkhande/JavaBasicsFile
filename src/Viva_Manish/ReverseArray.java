package Viva_Manish;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) 
	{
	int age[]= new int[4];
	age[0]=10;
	age[1]=20;	
	age[2]=30;
	age[3]=60;
	int age1[]= new int[age.length];
	System.out.println(Arrays.toString(age));
	for(int i=0,j=age.length-1; i<age.length; i++, j--)
	{
		age1[j]=age[i];
	}
	System.out.println(Arrays.toString(age1));
	
	
	}

}
