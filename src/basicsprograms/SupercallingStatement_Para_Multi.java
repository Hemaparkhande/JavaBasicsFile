package basicsprograms;
//Assignment 56
class Amazon_1
{
	Amazon_1(String name)
	{
		System.out.println("Constructor 1");
	}
	
}
class Google_2 extends Amazon_1
{
	Google_2(int a)
	{
		super("Hema");
		System.out.println("Constructor 2");

	}
}
public class SupercallingStatement_Para_Multi extends Google_2
{
	SupercallingStatement_Para_Multi()
	{
		super(10);
		System.out.println("Constructor 3");

	}
public static void main(String[] args) 
	{
		new SupercallingStatement_Para_Multi();
	}

}
