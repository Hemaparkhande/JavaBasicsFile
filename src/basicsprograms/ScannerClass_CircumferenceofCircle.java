package basicsprograms;
//Assignment 44
import java.util.Scanner;

public class ScannerClass_CircumferenceofCircle 
{
	static double pi_value = Math.PI;

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		double r = s1.nextDouble();
		
		double circumference = 2*Math.PI*r;
		System.out.println("The circumference (perimeter) of the Circle is: " + circumference);

		s1.close();
	}

}
