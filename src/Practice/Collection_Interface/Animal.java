package Practice.Collection_Interface;

class bird
{
	bird(int a)
	{
		System.out.println("This is parent constructor");			
	}

}
public class Animal extends bird
{
	
	Animal()
	{
		super(10);
		System.out.println("This is child constructor");	
	}

	public static void main(String[] args)
	{

		new Animal();
	}

}
