package basicsprograms;
//Assignment 40
import java.util.Scanner;

public class ScannerClass_AreaOfCircle 
{
	static double pi_value = Math.PI;
			
public static void main(String[] args) 
{
	Scanner s1 = new Scanner(System.in);
		double r = s1.nextDouble();
		double area= Math.PI*r*r;
		System.out.println(area);
	
		s1.close();}

}
