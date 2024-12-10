package basicsprograms;
//Assignment 41
import java.util.Scanner;

public class ScannerClass_AreaOfRectangle 
{

public static void main(String[] args) 
	{
	Scanner s1 = new Scanner(System.in);
		int l= s1.nextInt();
		int b= s1.nextInt();
		int area = l*b;
		System.out.println(area);
	
		s1.close();
	}

}
