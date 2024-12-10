package basicsprograms;
//Assignment 46
import java.util.Scanner;

public class ScannerClass_CircumferenceofSquare 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int a= s1.nextInt();
		int circumference = 4*a;
		System.out.println(circumference);
		
		s1.close();
	}

}
