package basicsprograms;
public class MethodAndConstructor_Overloading 
{ 
	static void login()
	{System.out.println("Login to Amazon");
	}
	
	void login(int a)
	{System.out.println("Login to Amazon prime");
	}
	
	MethodAndConstructor_Overloading()
	{ System.out.println("Login to Netflix");
	}
	
	MethodAndConstructor_Overloading (int a)
	{System.out.println("Login to Disney");

	}
	public static void main(String[] args) 
	{
		login();
		MethodAndConstructor_Overloading m1=new MethodAndConstructor_Overloading ();
		m1.login(10);
		new MethodAndConstructor_Overloading ();
		new MethodAndConstructor_Overloading(10);

	}

}
