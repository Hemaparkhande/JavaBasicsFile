package Package2;

public class Try_Catch_Block {

	public static void main(String[] args) 
	{
		try { // no exception then try block will execute
			int c=1/0;  // 1 has come from parent class  int value byte =32
			System.out.println(c);
						// 2 has come from grand parent class
			}
	
		catch(ArithmeticException a1)// here only catch block will execute becuase exception is occuring
		{
			System.out.println("Sorry there is a problem, but you can proceed");
		}
		
		
		
	}

}
