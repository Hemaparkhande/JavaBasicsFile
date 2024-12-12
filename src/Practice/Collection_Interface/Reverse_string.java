package Practice.Collection_Interface;

public class Reverse_string {

	public static void main(String[] args) 
	{
		
		String s1= "mom";
		String s2= "";
		
		for(int i=s1.length()-1; i>=0; i--)
		{
			char c = s1.charAt(i);
			s2 = s2+ c;	
			
			
		}
		System.out.println(s2);
		
		if (s1.equals(s2))
		{
			System.out.println("It's palindrom");
		}
		else
		{
			System.out.println("It's not palindrom");
		}
	}

}
