package com.assignement;

import java.util.Arrays;

public class ArrayProblem_KV2 
{
	static int no_of_alphabets = 0;
	static int no_of_digits =0;
	static int no_of_spaces = 0;
	static int no_of_special_characters = 0;

	public static void main(String[] args) 
	{
		String s1 = "KV no 2+";
		char c[] = s1.toCharArray();
		System.out.println(Arrays.toString(c));
		
		for(int i=0; i<s1.length(); i++)
		{
			boolean b1 = Character.isAlphabetic(c[i]);
			boolean b2 = Character.isDigit(c[i]);
			boolean b3 = Character.isWhitespace(c[i]);
			
			if(b1==true)
			{
				no_of_alphabets++;
			}
			if (b2==true)
			{
				no_of_digits++;
			}
			if(b3==true)
			{
				no_of_spaces++;
			}
		}
		System.out.println("Char:"+no_of_alphabets);
		System.out.println("digit:"+no_of_digits);
		System.out.println("spaces:"+no_of_spaces);
		int spcchar = s1.length()-(no_of_alphabets)-(no_of_digits)-(no_of_spaces);
		System.out.println("spc char:" + spcchar);
	}

}
