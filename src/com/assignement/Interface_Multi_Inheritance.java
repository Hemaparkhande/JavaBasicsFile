package com.assignement;//Assignment 66 
//Write a program to create relationship between class and abstract class,abstract class and interface(Multi level inheritence)"
interface One
{
	void add();
	void sub();
}
interface Two
{
	void mul();
	void div();
}
public class Interface_Multi_Inheritance implements One, Two
{
	public static void main(String[] args) 
	{
	}
	@Override
	public void mul() {
		// TODO Auto-generated method stub	
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
}
}
