package Practice.Collection_Interface;

import java.util.Arrays;

public class Numberofalphabets {

	public static void main(String[] args) 
	{
	String s1 = "Hema123*";
	
	char [] c= s1.toCharArray();
	
	System.out.println(Arrays.toString(c));
	
	for(int i=0; i<s1.length(); i++ )
	{
		Character.isAlphabetic(i);
		
	}
	}
	

}
