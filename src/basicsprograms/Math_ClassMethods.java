package basicsprograms;//Assignment 29
public class Math_ClassMethods 
{
	public static void main(String[] args)
	{
		System.out.println(Math.addExact(10,20));
		System.out.println(Math.addExact(2000,2000));
		System.out.println(Math.subtractExact(10,20));
		System.out.println(Math.subtractExact(1000, 1000));
		System.out.println(Math.multiplyExact(10,20));
		System.out.println(Math.multiplyExact(1000, 10));
		System.out.println(Math.multiplyExact(1000, 1000));
		System.out.println(Math.max(100, 10));
		System.out.println(Math.max(1.5, 3.5));
		System.out.println(Math.max(1f, 2f));
		System.out.println(Math.max(1000, 1000));
		System.out.println(Math.min(10, 10));
		System.out.println(Math.min(1.3, 4.5));
		System.out.println(Math.min(10f,2f));
		System.out.println(Math.min(1000, 1000));		
		System.out.println(Math.abs(-10));
		System.out.println(Math.abs(-5.3));
		System.out.println(Math.abs(-5000));//abs give positive number
		System.out.println(Math.abs(-10f));
		double pivalue=Math.PI;
		System.out.println(pivalue);
		for (int a=1;a<=8;a++);
		{
		System.out.println(Math.random());
		}

}
}
