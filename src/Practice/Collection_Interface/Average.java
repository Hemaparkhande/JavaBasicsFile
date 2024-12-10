package Practice.Collection_Interface;

public class Average {

	public static void main(String[] args) 
	{
		
		int Array []= new int[4];
		Array[0]= 5;
		Array[1]= 15;
		Array[2]= 20;
		Array[3]= 10;
		double sum = 0;
		
		for(int i=0; i<=Array.length-1; i++)
		{
			sum = sum+ Array[i];
			
		}
		
		System.out.println(sum);
		double average = sum/Array.length;
		System.out.println(average);
		
		if (Array[0]==5)
		{
			System.out.println("Matching number 5");
		}
		else 
			System.out.println("Not matching");
		
		
	}
	
}
