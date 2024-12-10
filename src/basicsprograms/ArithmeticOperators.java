package basicsprograms;
public class ArithmeticOperators {

static void addition() 
{int a=100;
int b=50;
int c=a+b;
System.out.println(c);}

static void subtraction() 
{int a=100;
int b=200;
int c=a-b;
System.out.println(c);
}
static void multiplication() 
{
	int a=500;
	int b=2;
	int c=a*b;
System.out.println(c);
}

static void division()
{
	double a=60;
	double b= 2;
	double c=a/b;
System.out.println(c);}

static void mod()
{
	int a=61;
	int b=25;
	int c=a%b;
System.out.println(c);}

public static void main(String[] args) 
{System.out.println("Main Method");
addition();
subtraction();
multiplication();
division();
mod();
}
}
