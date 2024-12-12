package basicsprograms;
abstract class Google10
{
	abstract void add();
	abstract void sub();
	static void login()
	{
		System.out.println("1");
	}
	void logout()
	{
		System.out.println("2");
	}
}
public class AbstractMethod extends Google10//concrete class-> concrete methods
//concrete methods -> which will have the implementation
{
public static void main(String[] args) 
{
	login();
	AbstractMethod g1=new AbstractMethod();
	g1.logout();
	g1.add();
	g1.sub();
}

@Override
void add() {
	// TODO Auto-generated method stub
	
}

@Override
void sub() {
	// TODO Auto-generated method stub
	
}



}
