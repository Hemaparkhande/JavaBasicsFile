package basicsprograms;
//Assignment 45
import java.util.Scanner;

public class ScannerClass_CircumferenceofRectangle 
{
public static void main(String[] args) 
{ 
	Scanner s1 = new Scanner(System.in);
	System.out.print("Enter the length of the rectangle: ");
	int a = s1.nextInt();
	
	System.out.print("Enter the width of the rectangle: ");
	int b = s1.nextInt();
	
	int circumference = 2*(a+b);
	System.out.println("The circumference (perimeter) of the rectangle is: " + circumference);

	s1.close();
	}

}
