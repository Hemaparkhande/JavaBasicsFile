package Practice.Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Collection_Methods {

	public static void main(String[] args) 
	{
		Collection c1 = new ArrayList();
		c1.add("dog");
		c1.add("cat");
		c1.add(10);
		c1.add(null);
		c1.add(null);
		c1.add(10);
		c1.add(true);
		System.out.println(c1);
		
//		Collection c2 = new ArrayList();
//		c2.add("Rina");
//		c2.addAll(c1);
//		System.out.println(c2);
		//c2.clear();
		//System.out.println(c2);
		//boolean b1 = c2.isEmpty();
		//System.out.println(b1);
		//System.out.println(c1.isEmpty());
		
//		System.out.println(c1.contains("dog"));
//		System.out.println(c2.containsAll(c1));
		//c1.remove("cat");
		//System.out.println(c1);
		//c2.removeAll(c1);
//		System.out.println(c2);
//		System.out.println(c1.size());

		Iterator i1 = c1.iterator();// it is applicable to entire collection hierarchy
		System.out.println("Forward iteration:" );
		while(i1.hasNext()) // don't give ;
		{
			System.out.println(i1.next());
		}
		
	
	
	
	
	}

}
