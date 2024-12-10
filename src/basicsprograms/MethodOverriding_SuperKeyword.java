
package basicsprograms;
//Assignment 58
class Google_5
{
	void Login()
	{	
		System.out.println("Login with name");	
	}
}
public class MethodOverriding_SuperKeyword extends Google_5
{
	void Login()
	{	
		System.out.println("Login with email id");	
		super.Login();//at any line, not used in main method

	}
	public static void main(String[] args) 
	{
		MethodOverriding_SuperKeyword m1= new MethodOverriding_SuperKeyword();
		m1.Login();
	
	}

}
