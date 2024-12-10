package basicsprograms;
//Assignment 57
public class ThisCalling_Statement //chain process
{
	
	ThisCalling_Statement()
    {
	this(1,"Good");
	  System.out.println("Non parametrized constructor");
	}
	
	ThisCalling_Statement(int a, String b)
	{
		this(1,2,"Hema");
		System.out.println("This is a 2nd constructor");
	}
	
	ThisCalling_Statement(int a, int b, String c)
	{
	
		System.out.println("This is a 3rd constructor");
	}
	
  public static void main(String[] args) 
  {
	  new ThisCalling_Statement();
	  
  }
}
