package com.assignement;
import java.util.Arrays;
public class Arrayproblem_kv_no_2 //very important for interview
{	static int countof_alphabet=0;
	static int countof_numeric=0;
	static int countof_space=0;
	static int countof_specialcharacters=0;
	public static void main(String[] args) 
	{	String a="KV no 2";
		char c1[]=   a.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<a.length();i++)	
		{
			boolean v1= Character.isAlphabetic(c1[i]);
			boolean v2= Character.isDigit(c1[i]);
			boolean v3= Character.isWhitespace(c1[i]);
			if(v1==true)
				{
				countof_alphabet++;
				}
			if(v2==true)
				{
				countof_numeric++;
				}
			if(v3==true)
				{
				countof_space++;
				}
		}
			System.out.println("The count of alphabet in the given Array->"+countof_alphabet);
			System.out.println("The count of numeric in the given Array->"+countof_numeric);
			System.out.println("The count of spaces in the given Array->"+countof_space);
			int countof_specialcharacters=c1.length-(countof_alphabet+countof_numeric+countof_space);
			System.out.println("The count of count of special characters in the given Array->"+countof_specialcharacters);

	}		
	

}
