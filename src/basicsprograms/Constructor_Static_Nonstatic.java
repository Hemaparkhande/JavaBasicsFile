package basicsprograms;
public class Constructor_Static_Nonstatic 
{
	static void Login()
	{
		System.out.println("Login with Hema");
	}
	void sub()
	{
		System.out.println("subtracting");
	}
	Constructor_Static_Nonstatic()
	{
		System.out.println("1st constructor");
	}
		public static void main(String[] args)
	{
	Login();
	Constructor_Static_Nonstatic s1=new Constructor_Static_Nonstatic();
	s1.sub();
	new Constructor_Static_Nonstatic();
	}

}
