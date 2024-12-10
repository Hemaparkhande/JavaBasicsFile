package Practice.Collection_Interface;

class animal// multi
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
class birds extends animal// single level
{
	void sparrow()
	{
		System.out.println("chiv");
	}
}
class insects extends animal
{
	void eagle()
	{
		System.out.println("fly");
	}
}
public class Single_Level_Inheritance extends birds// single level
{
	
	void cat1()
	{
		System.out.println("meao");
	}
	public static void main(String[] args) 
	{
		Single_Level_Inheritance s1= new Single_Level_Inheritance();
		s1.dog(10);
		s1.cat1();
		s1.sparrow();
		animal.cat();
		cat();
	
	}

}
