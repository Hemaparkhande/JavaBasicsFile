package basicsprograms;
public class NonstaticMethod 
{
	void login()
	{System.out.println("login with email id");
	}
	void logout()
	{System.out.println("logout");
		}
	public static void main(String[] args) 
{
	NonstaticMethod h1=new NonstaticMethod();
	// syntax of creating an object
	// className referance_variable=new className();
	// referance_variable.nonstaticmethod();
	h1.login();
	h1.logout();
}
}
