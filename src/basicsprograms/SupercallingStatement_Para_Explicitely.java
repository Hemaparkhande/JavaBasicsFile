package basicsprograms;
//Assignment 55
class Amazon_10
{
	Amazon_10(int a)
	{
		System.out.println("Constructor 1");
	}
}
public class SupercallingStatement_Para_Explicitely extends Amazon_10
{
	SupercallingStatement_Para_Explicitely() 
	{
	super(10);
	System.out.println("Constructor 2");
	}
public static void main(String[] args) 
	{
		new SupercallingStatement_Para_Explicitely();
	}

}
