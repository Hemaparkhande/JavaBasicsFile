package basicsprograms;
public class Method_OverloadingBasic 
{
	static void add()
	{System.out.println("Hi");
	}
	static void add(int a)
	{System.out.println("Bye");
	}
	void add(int a, int b ) // you can overload but parameters should be different
	{System.out.println("Yes");
	}
	void add(int a, String b)
	{System.out.println("No");
	}
	
	public static void main(String[] args)
	{
		add();
		add(25);
		Method_OverloadingBasic m1=new Method_OverloadingBasic();
		m1.add(5,2);
		Method_OverloadingBasic m2=new Method_OverloadingBasic();
		m2.add(20, "Hema");
	}

}
