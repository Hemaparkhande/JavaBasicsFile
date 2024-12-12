package basicsprograms;

import java.util.Scanner;

public class ScannerClass_Switch2 
{

	public static void main(String[] args) 
	{
	Scanner s1 = new Scanner(System.in);
		int a1= s1.nextInt();
		switch(a1)
		{
		case 1: 
			{
				System.out.println("Open Chrome browser");
				break;
			}
		
		case 2:
		{
			System.out.println("Open Edge");
			break;
		}
		case 3:
		{
			System.out.println("open safari");
			break;
		}
		default :
		{
			System.out.println("sorry can't open browser");
		}
		
	

}
	}}
