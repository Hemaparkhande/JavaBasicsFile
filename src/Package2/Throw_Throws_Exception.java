package Package2;

public class Throw_Throws_Exception {

	public static void main(String[] args) throws NullPointerException
	{
		if(10<50)
		{
			throw new NullPointerException("Sorry the file is empty");
			//			 cant write 2 thorw
		}
			
		else
		{
			throw new ArithmeticException();
		}
		
		
	}

}
