package Practice_ScannerClass;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) 
	{
		Scanner s1= new Scanner(System.in);
		int b= s1.nextInt();
		int a= s1.nextInt();
		float c= s1.nextFloat();
		float sum= a+b+c;
		System.out.println("sum of number=" +sum);
		
		
		
	}

}
