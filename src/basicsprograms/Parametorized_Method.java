package basicsprograms;
public class Parametorized_Method 
{
	static void add(int a, int b)
	{
		System.out.println(a+b);
	}
	static void sub(double a, String b)
	{
		System.out.println("subtracting");
	}
	static void sub(int a, double b, String c, char d, boolean e)
	{
		System.out.println("Call all of them");
	}
	
	public static void main(String[] args) 
	{
		add(100,50);
		sub(200.00, "Hema");
		sub(1, 1.3, "Parkhande", 'P',true);
	}

}
