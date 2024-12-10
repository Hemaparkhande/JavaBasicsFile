package Practice.Collection_Interface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
public class ListInterface_Methods {

	public static void main(String[] args) 
	{
		List l1 = new ArrayList();
		l1.add("dog");
		l1.add("cat");
		l1.add(10);
		l1.add(null);
		l1.add(null);
		l1.add('A');
		l1.add(false);
		System.out.println(l1);
		
		Iterator i1= l1.iterator();
		System.out.println("forward:");
		while(i1.hasNext())
		{
			System.out.println( i1.next());
		}
		
		ListIterator i2= l1.listIterator();
		System.out.println("Forward:");// return type boolean
		while(i2.hasNext())
		{
			System.out.println(i2.next());// return type object
		}
		System.out.println("Backward:");// return type boolean
		while(i2.hasPrevious())
		{
			System.out.println(i2.previous());// return type object
		}
		
		//System.out.println(l1.contains("seema"));
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
