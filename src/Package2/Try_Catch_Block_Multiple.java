package Package2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Block_Multiple {

	public static void main(String[] args) 
	{
		try {
			Scanner s1= new Scanner(System.in);
			{System.out.println("Please enter the size of array");
			}
			int rollno []= new int[s1.nextInt()];
		}
		catch(InputMismatchException m1)
		{
			System.out.println("Size has to be only in positive value");
				Scanner s1= new Scanner(System.in);
				System.out.println("Please enter the size of array");
				int rollno []= new int[s1.nextInt()];
		}
		catch(NegativeArraySizeException m2)
		{
			System.out.println("Size cannot be negative value");
			Scanner s1= new Scanner(System.in);
			System.out.println("Please enter the size of array");
			int rollno []= new int[s1.nextInt()];
		
		}
		finally 
		{
			System.out.println("Create connection with database");
		}
		
		
	}

}
