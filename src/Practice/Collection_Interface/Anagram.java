package Practice.Collection_Interface;

public class Anagram {

	public static void main(String[] args) {
		{
			String s1="face";
			String s2="acfe";
			
			char[] c1=s1.toCharArray();
			char[] c2=s2.toCharArray();
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			Arrays.sort(c1);
			Arrays.sort(c2);
			if(Arrays.equals(c1, c2))
					{
				System.out.println("it is anagram");
			}
			else 
			{
				System.out.println("It is not Anagram");
			}

	}
