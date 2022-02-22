Question 4
An abstract class has a constructor which prints "This is constructor of abstract
class", an abstract method named 'a_method' and a non-abstract method which
prints "This is a normal method of abstract class". A class 'SubClass' inherits the
abstract class and has a method named 'a_method' which prints "This is abstract
method". Now create an object of 'SubClass' and call the abstract method and
the non-abstract method. (Analyse the result)

Ans.
package com.org.gen.day3;

abstract class Myclass
{
	int x=10;
	abstract void calculate(int a,int b);	
	public int data(int a)
	{
		return a*a;
	}
	public Myclass()
	{
		System.out.println("Abstarct class Constructor");
	}
	public static void m1()
	{
		System.out.println("Abstract Static method");
	}
	final void f()
	{
		System.out.println("Abstract final Method");
	}
}
public class Q4 extends Myclass{

	void calculate(int a,int b)
    {
   	 int c=a+b;
   	 System.out.println("Sum is: "+c);
    }
    public Q4()
    {
   	 super();
   	 System.out.println("Main class constructor");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Q4 a=new Q4();
        a.calculate(2, 3);
        Myclass.m1();
        a.f();
        a.data(2);

}
}