package Practice.Collection_Interface;

class animal11
{
	void dog(int a)
	{
		System.out.println("barks");
	}
	static void cat()
	{
		System.out.println("meao1");
	}
}


public class Hierarchical_Inheritance extends animal11
{
	 void parrot()
	 {
		 System.out.println("mitu");
	 }
	public static void main(String[] args) 
	{
		Hierarchical_Inheritance h1= new Hierarchical_Inheritance();
		h1.dog(10);
		
	}

}
