package Viva_Manish;

public class ReverseString {

	public static void main(String[] args) 
	{
		String s1= "Hema";
		String s2 ="";
		for(int i=s1.length()-1; i>=0;i--)
		{
			char c= s1.charAt(i);
			s2= s2 + c;
		}

		System.out.println(s2);
		
		
	}

}
