package basicsprograms;
//Assignment 59 
//Write a program where the non static global variable datatype used are same as local variable. 
//Use non static method to use the local variable in method. 
//Use this key word to update the global variable value same as local variable
public class ThisKeyword_GlobalAndLocal_Same 
{
	int a=10;
	int b =20;
	void add()
	{
		int a=1000;
		int b =2000;
		this.a=a;
		this.b=b;
		System.out.println(a+b);
	}
	public static void main(String[] args) 
	{
		ThisKeyword_GlobalAndLocal_Same t1= new ThisKeyword_GlobalAndLocal_Same();
		t1.add();
		
	}

}
