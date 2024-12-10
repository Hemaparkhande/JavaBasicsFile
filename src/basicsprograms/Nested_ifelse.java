package basicsprograms;
public class Nested_ifelse 
{public static void main(String[] args)
{	int a=50;
	int b=60;		
	if (a<b)
	{
           if (a!=b)
           {   System.out.println("1");
           }
           else
           {
	          System.out.println("2");
	          }
	}
    else 
    {
		 System.out.println("3");
	 }
	
	int empage=20;
	int yrsofexp=5;
	if(empage>yrsofexp)
	{
			if (empage==yrsofexp)
			{
				System.out.println("Run in marathon");
			}
			else
			{
				System.out.println("Don't run");
			}
	}
	else
	{
		System.out.println("Ask someone to run");
	}
}
}