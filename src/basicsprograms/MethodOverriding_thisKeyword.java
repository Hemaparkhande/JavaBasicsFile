package basicsprograms;
 
public class MethodOverriding_thisKeyword 
{
	int id;
	String name;
	double salary;
	void Employee_Muster(int id, String name, double salary)
	{
		this.id= id; //this word can be at any line
		this.name= name;// assign local variable to global variable
		this.salary= salary;// not written in main method
	}
	
	public static void main(String[] args) 
	{
	MethodOverriding_thisKeyword m1= new MethodOverriding_thisKeyword();
	m1.Employee_Muster(101,"Parkhande",50000);
	System.out.println(m1.id);
	System.out.println(m1.name);	
	System.out.println(m1.salary);
	}

}
