package basicsprograms;
public class UpdateVariableLocalandGlobal 
{
	static int a=10;//global variable Assignment 26
	int c= 500;//global variable non static
  	static void add()
	{System.out.println(a);
	}
	void add1()
	{
		this.c= 150;//update global variable non static 
		System.out.println(1000 + this.c);
	}
	

	public static void main(String[] args) 
	{ int b=50;//local variable
		  b=100;
		{System.out.println(b);
		}
		a=20;//global variable
		add();
		
		UpdateVariableLocalandGlobal u1=new UpdateVariableLocalandGlobal();
		u1.add1();
	}
		
		
}

