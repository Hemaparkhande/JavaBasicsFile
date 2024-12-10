package Package2;
//Assignment 52
class seema extends HierarchicalLevel_Inheritance
{
		public static void Login() 
		{
			System.out.println("Login to Chrome");

		}
}
class hema extends HierarchicalLevel_Inheritance
{
	 void Logout()
	{
		 System.out.println("Logout from Chrome Brwoser");
	}
}
public class HierarchicalLevel_Inheritance 
//parent class
{

	public static void main(String[] args) 
	{
		seema.Login();
		hema s1 = new hema();
		s1.Logout();
	}	

}

