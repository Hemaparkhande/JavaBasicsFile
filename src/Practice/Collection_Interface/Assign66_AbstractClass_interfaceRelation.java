package Practice.Collection_Interface;
//Write a program to create relationship between class and abstract class,abstract class and interface(Multi level inheritence)"

interface father
{
	void add();
	
}
abstract class mother implements father
{
	abstract void add(int a);
	static void sub() {
	}	
}
class mom extends mother
{
	

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void add(int a) {
		// TODO Auto-generated method stub
		
	}
	
}

public class Assign66_AbstractClass_interfaceRelation extends mother
{
	@Override
	public void add() {
		System.out.println("Hema");
		
	}

	@Override
	void add(int a) {
		
		System.out.println("Seema");
	}

	public static void main(String[] args) 
	{
		Assign66_AbstractClass_interfaceRelation a1= new Assign66_AbstractClass_interfaceRelation();
		a1.add();
		a1.add(10);

	}

}
