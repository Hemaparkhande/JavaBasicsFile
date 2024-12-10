package basicsprograms;
public class Method_Overloading 
{	static void add()
		{	System.out.println(1);	}
	static void add(int a)
	{	System.out.println(2);	}
	static void add(int e, int d, int h, int p)
	{	System.out.println(3);	}
	static void add(char a)
	{	System.out.println(4);	}
	static void add(int a, char b, String c)
	{   System.out.println(5);}

	void add(int m, int a,int c)
	{System.out.println("A");}	
	void add(int a, int b)
	{System.out.println("B");}
	void add(double c)
	{System.out.println("C");	}
	void add1(char a)
	{System.out.println("D");	}
	void add1(int a, char b, String c)
	{System.out.println("E");}
	
	public static void main(String[] args) 
{		add(); //static method
		add(10);
		add(1,4,5,8);
		add('S');
		add(5,'A', "Hema");
		Method_Overloading a1=new Method_Overloading();
		a1.add(9,1,12); //non static method
		Method_Overloading a2=new Method_Overloading();
		a2.add(15,16);
		Method_Overloading a3=new Method_Overloading();
		a3.add(3.67);
		Method_Overloading a4=new Method_Overloading();
		a4.add1('S');
		Method_Overloading a5=new Method_Overloading();
		a5.add1(5,'A', "Hema");
		}
}
