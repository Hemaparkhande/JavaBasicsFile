package basicsprograms;
//Assignment 54
class Google1 // Google is a constructor
{
	Google1()
	{
		System.out.println("Google Constructor");
	}
}

public class SupercallingStatement_Explicitely extends Google
{
	SupercallingStatement_Explicitely()
	
	{
		super();//always first line, call parent class constructor from child class constructor
		//write super or not, it is always present
		System.out.println("Amazon Constructor");
	}
	public static void main(String[] args) 
	{
		new SupercallingStatement_Explicitely();
	}

}
