package com.assignement;

interface Credentials
{
	void Login();
	void Logout();
	void Logout1();
	int a1=2;// all the variables are static,final and public
	
}
public class Interface_ClassRelation implements Credentials 
// only class inherits interface
{
	public void Login() 
	{
		System.out.println("Real logic by developer");
	}
	public void Logout() 
	{
		System.out.println("Real logic by developer 1");
	}
	public static void main(String[] args) 
	{
		Interface_ClassRelation i1= new Interface_ClassRelation();
		i1.Login();
		i1.Logout();
		int sum= a1+ a1;
		System.out.println(sum);
	}
	@Override
	public void Logout1() {
		// TODO Auto-generated method stub
		
	}

		
	}

	
	

