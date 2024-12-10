package basicsprograms;
public class NonStaic_Parametorized_Method 
{
	void add(int a, double b)
	{System.out.println(a+b);
	}
	void Login(String un, String pswd)
	{System.out.println("Login un, Login pswd");
	}
		
	public static void main(String[] args) 
	{
	NonStaic_Parametorized_Method h1=new NonStaic_Parametorized_Method();
	h1.add(5, 2.354);
	NonStaic_Parametorized_Method h2=new NonStaic_Parametorized_Method();
	h2.Login("Login un", "Login pswd");;
	}
}
