package basicsprograms;
//Assignment 42
import java.util.Scanner;

public class ScannerClass_AreaOfSquare 
{
	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		int a= s1.nextInt();
		int area = a*a;
		System.out.println(area);
	
		s1.close();
		}

}
