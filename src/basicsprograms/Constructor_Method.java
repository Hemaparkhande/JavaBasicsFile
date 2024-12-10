package basicsprograms;
//constructor can be public, abstract with no implementation or final
final class Constructor_Method 
{   
	Constructor_Method()
		{
		System.out.println("Adding");
	    }
	 
	public static void main(String[] args) 
	{
		new Constructor_Method();
		Constructor_Method c1 = new Constructor_Method();//2 ways to call
				
	}

}
