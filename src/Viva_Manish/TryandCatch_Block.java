package Viva_Manish;

public class TryandCatch_Block {

	public static void main(String[] args) 
	{
		try {		int i = 1/0;

			System.out.println("Try block will execute");
		}
		catch ( ArithmeticException a1)
		{
		
			System.out.println("Catch block will execute");
		}
		
	}

}
