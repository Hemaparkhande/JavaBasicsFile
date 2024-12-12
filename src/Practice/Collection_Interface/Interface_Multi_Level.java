package Practice.Collection_Interface;

public class t1 {

}
package Interface_Prgram;//Assignment 66
interface one
{   void add();
	void mul(int a);
}
abstract class two implements one
{   abstract void sub(double d);
	abstract void div(boolean b);
}
public class Interface_Multi_Level extends two
{
    public void sub(double d)
	{
		System.out.println("It is second interface method1 ");
	}
    public void div(boolean b) 
	{
    	System.out.println("It is second interface method2 ");
	}
    public void add()
	{
    	System.out.println("It is first interface method1 ");
	}
    public void mul(int a) 
	{
    	System.out.println("It is first interface method2 ");
	}
    public static void main(String[] args) 
	{ Interface_Multi_Level i=new Interface_Multi_Level();
		i.add();
		i.div(false);
		i.mul(8);
		i.sub(5.5);
		
	}

	

}