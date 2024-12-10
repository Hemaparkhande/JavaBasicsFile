package Package2;
//assignment 51
class three
{
	static void Login()
	{
		System.out.println("Login to Chrome");
	}
}
class two extends three
{
	 void Logout()
	{
		 System.out.println("Logout from Chrome");
	}
}

public class MultiLevel_Inheritance extends two
{

	public static void main(String[] args) 
	{
		Login();
		MultiLevel_Inheritance t1 = new MultiLevel_Inheritance();
		t1.Logout();// create object for child class
	}

}
