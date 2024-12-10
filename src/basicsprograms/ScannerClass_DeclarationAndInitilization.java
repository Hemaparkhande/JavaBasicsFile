package basicsprograms;
//Assignment 38
import java.util.Scanner;

public class ScannerClass_DeclarationAndInitilization
{

	public static void main(String[] args) 
	{
		Scanner s1 = new Scanner(System.in);
		String name= s1.next();
		int i1=	     s1.nextInt();
		byte b1=     s1.nextByte();
		double d1=   s1.nextDouble();
		float f1=    s1.nextFloat();
		short h1 =   s1.nextShort();
		long l1 =    s1.nextLong();
		boolean o1 = s1.nextBoolean();

	
		s1.close();
		}

}
