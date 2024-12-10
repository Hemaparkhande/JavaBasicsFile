package basicsprograms;
public class UpdateValue_LocalGlobal 
{
	static double pi=3.14; //global variable has default value
	static void add()
	{
		double area=pi*10*10;
		System.out.println(area);
	}
public static void main(String[] args)
{ 
	/*int a=10;  // Local variable-brown color	
	int gender= 'M';*/
	double area1=pi*15*15;
	System.out.println(area1);
	add();
}
}