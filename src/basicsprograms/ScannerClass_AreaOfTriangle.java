package basicsprograms;
//Assignment 39
import java.util.Scanner;

public class ScannerClass_AreaOfTriangle 
{
public static void main(String[] args) 
{Scanner s1= new Scanner(System.in);
		int b= s1.nextInt();
		int h= s1.nextInt();
		double area = 1.0/2*b*h;
		System.out.println(area);
		
		s1.close();
}
}