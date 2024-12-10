package basicsprograms;
public class ConstructorOverloading 
{
	ConstructorOverloading()
    {
	  System.out.println("This is a 1st constructor");
	}
	ConstructorOverloading(int a, double b, char c, String d)
  {
	  System.out.println("This is a 2nd constructor");
	}
    
  public static void main(String[] args) 
  {
	  new ConstructorOverloading();
	  ConstructorOverloading c1= new ConstructorOverloading(1, 1.2, 'S', "Hema");
	  new ConstructorOverloading(1, 1.2, 'S', "Hema"); // 2 ways to call
	  new ConstructorOverloading(1, 3.5, 'P', "OK");
	  
  }

}
