package basicsprograms;
//Assignment 53
class Google // Google is a constructor
{
	Google()
	{
		System.out.println("Google Constructor");
	}
}

public class SupercallingStatement_ConstructorImplicitely extends Google
{
	
	SupercallingStatement_ConstructorImplicitely()
	
	{
		//super();
	//always first line, call parent class constructor from child class constructor
	//write super or not, it is always present
		System.out.println("Amazon Constructor");
	}
	public static void main(String[] args) 
	{
		new SupercallingStatement_ConstructorImplicitely();
		
	}

}
