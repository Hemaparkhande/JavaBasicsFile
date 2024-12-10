package com.assignement;

public interface Test1 extends Test2
{
void add1();
void add2();

}
interface Test2
{
	void add();
}
class Test3 implements Test1
{
	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add2() {
		// TODO Auto-generated method stub
		
	}}
