package com.assignement;

//"Assignment 116 Write a program using the put() method with String, String parameters in the Map Interface. "
//"Assignment 117 Write a program using the put() method with Object, Object parameters in the Map Interface."

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.HashMap;

public class Map_PutMethod_String_Object
{

	public static void main(String[] args) 
	{
		Map<String, String> m1= new HashMap<String, String>();
		m1.put("Hema", "Seema");
		m1.put("Reema", "Teena");
		m1.put("Lata", "Gatha");
		m1.put("Ema", "Sona");
		m1.put("Harish", "Mohan");
		
		System.out.println(m1);
		
		Map<Object,Object>m2= new HashMap<Object,Object>();
		m2.put("car", "C100");
		m2.put("train", "T150");
		m2.put("Bus", "B200");
		m2.put("Boat", "B500");
		System.out.println(m2);
		m2.remove("C100");// only keys removed
		System.out.println(m2);

//		Set<String> s1 = m1.keySet();
		for(String s1: m1.keySet())
		{
			System.out.println(s1);
		}
		System.out.println("only values:");
		for(String s2: m1.values())
		{
			System.out.println(s2);
		}
		for(Entry<String, String> s3: m1.entrySet())
		{
			System.out.println(s3);
		}
		
		
		
	}

}
