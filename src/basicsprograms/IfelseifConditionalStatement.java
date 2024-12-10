package basicsprograms;
public class IfelseifConditionalStatement {
public static void main(String[] args) 
{
	int a=500;
	int b=1000;
	if (a>b)
	{System.out.println("Hello");
	}
	
	else if(a<=b)
	{System.out.println("Bye");
	}
	else
	{System.out.println("welcome");
	}
	
	int empid=1000;
	int empage=1000;
	if(empage< empid)
	{
		System.out.println("He can withdraw money");
	}
	else if(empage > empid)
	{
		System.out.println("He cannot withdraw money");
	}
	else
	{
		System.out.println("He can borrow money");
	}
	
	
	
}
}