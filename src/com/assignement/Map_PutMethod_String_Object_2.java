package com.assignement;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Map_PutMethod_String_Object_2 
{

	public static void main(String[] args) 
	{
		Map <String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("Hema", 100);
		m1.put("seema", 100);
		m1.put("Mona", 100);
		System.out.println(m1);
		
		Map<Object,Object>m2= new HashMap<Object,Object>();
		m2.put("car", "C100");
		m2.put("train", "T150");
		m2.put("Bus", "B200");
		m2.put("Boat", "B500");
		System.out.println(m2);
		
		for(String s1:m1.keySet())
		{
			System.out.println(s1);
		}
		for(Integer s2: m1.values())
		{
			System.out.println(s2);
		}
		for(Entry<String, Integer> s3: m1.entrySet())
		{
			System.out.println(s3);
		}
	}

}
