package Practice.Collection_Interface;

import java.util.Arrays;

public class Numberofalphabets {
	static int no_of_alphabets =0;

	public static void main(String[] args) 
	{
	String s1 = "Hema123*";
	
	char [] c= s1.toCharArray();
	
	System.out.println(Arrays.toString(c));
	
	for(int i=0; i<s1.length(); i++ )
	{
		boolean b1 = Character.isAlphabetic(c[i]);
		if(b1==true)
		{
			no_of_alphabets++;
		}
	
	}
	System.out.println(no_of_alphabets);

	}
	

}
//program half written