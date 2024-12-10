package Practice.Collection_Interface;

class SuperCalling_Statement11
{
	SuperCalling_Statement11(int a)
	{
	System.out.println("This is parent constructor");		
		
}
public class SuperCalling_Statement12 extends SuperCalling_Statement11
{
	
	SuperCalling_Statement12()
	{
		super(10);
		System.out.println("This is child constructor");		
	
	}

	public static void main(String[] args)
	{
		
		new SuperCalling_Statement11(1);
	}

}
}
