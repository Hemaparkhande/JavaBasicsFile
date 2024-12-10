package basicsprograms;
//Assignment 43
import java.util.Scanner;

public class ScannerClass_CircumferenceofTriangle 
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int a = s1.nextInt();
		int b = s1.nextInt();
		int c = s1.nextInt();
		
		int circumference = a+b+c;
		System.out.println("The circumference (perimeter) of the Triangle is: " + circumference);
		s1.close();

	}

}
