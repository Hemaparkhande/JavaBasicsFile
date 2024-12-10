package Package2;

public class AccessSpecifier_InsidePackage1 
{

public static void main(String[] args) 
	{
	AccessSpecifier_InsidePackage2 a1= new AccessSpecifier_InsidePackage2();
	a1.sub();
	a1.mul();
	a1.div();
	//a1.add will not come as it is private method
	}

}
