package Practice.Collection_Interface;


public class ThisCalling 
{
	ThisCalling(int a)
	{
		System.out.println("This is parent constructor");			
	}
	ThisCalling()
	{
		this(10);
		System.out.println("This is parent2 constructor");			
	}
	
	public static void main(String[] args) 
	{
		new ThisCalling();
		
	}

}
