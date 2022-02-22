Question 3 
Create a class named 'Rectangle' with two data members 'length' and 'breadth' and two methods to print the area and perimeter of the rectangle respectively. Its constructor having parameters for length and breadth is used to initialize length and breadth of the rectangle. Let class 'Square' inherit the 'Rectangle' class with its constructor having a parameter for its side (suppose s) calling the constructor of its parent class as 'super(s,s)'. Print the area and perimeter of a rectangle and a square.

Ans.
package com.org.gen.day2;
class Rectangle
{
	int length;
	int breadth;
	public Rectangle(int len,int bred)
	{
		length=len;
		breadth=bred;
	}
	void area()
	{
		System.out.println("Area: "+(length*breadth));
	}
	void perimeter()
	{
		System.out.println("Perimeter: "+(2*(length+breadth)));
	}
}
class Square extends Rectangle
{
	int s=4;
	
    public Square()
    {
       super(4,4);
    }
}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Rectangle r=new Rectangle(2,3);
       r.area();
       r.perimeter();
       Square s=new Square();
       s.area();
       s.perimeter();
	}

}