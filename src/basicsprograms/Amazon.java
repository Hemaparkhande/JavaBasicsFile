package basicsprograms;
public class Amazon 
{
	Amazon()// multiple constructor methods with diff data types
	{
		System.out.println("This is 4th Consctur");
	}
	Amazon(double a)
	{
		System.out.println("This is 1st Constructor");
	}
	Amazon(int a)
	{
		System.out.println("This is 2nd Constructor");
	}
	Amazon(char manish)
	{
		System.out.println("This is 2nd Constructor");
	}
	Amazon(int a, int b,String c)
	{
		System.out.println("This is 3rd Constructor");
	}
	public static void main(String[] args) 
	{
		Amazon m1=	new Amazon(1,2,"Bhavya");
		Amazon m2=new Amazon(90);
		new Amazon(3.14);
		new Amazon();
//	testing git hub check in commit

		
	}

}
