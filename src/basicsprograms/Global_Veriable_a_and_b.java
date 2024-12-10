package basicsprograms;
public class Global_Veriable_a_and_b //Assignment 27
{	static int a=100;
	static int b=20;
	int c=100;
	int d=200;
	
	static void add()
	{System.out.println(a+b);
	}
	static void sub()
	{System.out.println(a-b);
	}
	static void mul()
	{System.out.println(a*b);
	}
	static void div()
	{System.out.println(a/b);
	}
	static void mod()
	{System.out.println(a%b);
	}
	
	 void add1()
	{System.out.println(a+c);
	}
	  void add2()
		{System.out.println(a+b);
		}
	   void sub1()
		{System.out.println(d-c);
		}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
		mod();
		Global_Veriable_a_and_b g1= new Global_Veriable_a_and_b();
		g1.add1();
	g1.add2();
	g1.sub1();
	}

}
