Question 1  
Create a class with a method that prints "This is parent class" and its subclass with another method that prints "This is child class". Now, create an object for each of the class and call
1 - method of parent class by object of parent class
2 - method of child class by object of child class
3 - method of parent class by object of child class.

Ans.
package com.org.gen.day2;

class Parent{
	void parent(){
		System.out.println("This is Parent Class");
	}
}

class Child extends Parent{
	void child(){
		System.out.println("This is child class..");
	}
}

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p1 = new Parent();
		Child c1 = new Child();
		p1.parent();
		c1.child();
		c1.parent();
		
	}

}
