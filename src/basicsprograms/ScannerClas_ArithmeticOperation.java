package basicsprograms;
//Assignment 37
import java.util.Scanner;

public class ScannerClas_ArithmeticOperation 
{

public static void main(String[] args) 
{
	Scanner s1= new Scanner(System.in);
		int a= s1.nextInt();
		int b= s1.nextInt();
	int sum= a+b;
	System.out.println(sum);
	int sub= a-b;
	System.out.println(sub);
	int mul= a*b;
	System.out.println(mul);
	int div= a/b;
	System.out.println(div);
	int mod= a%b;
	System.out.println(mod);

	s1.close();}

}
