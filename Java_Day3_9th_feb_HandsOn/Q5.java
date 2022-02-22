Question 5
Given an inteface in1 which includes a method display which takes an integer
as input .
interface in1
{
 void display(int p);
}
Task is to write a class testClass which implements interface in1 and has a
method named display which takes an integer as input and total number of
prime numbers between 2 and integer k (including it). Main function in written
for you in the editor.
Input:
The first line will contain an integer T (number of test cases). Each test case
consists of an integer n.
Output:
Print total number of prime numbers between 2 and the given number
( including them ).
Constraints:
1 < = T < = 1000
2<= n <= 104
Example:
Input:
2
13
19
Output:

Ans.

package com.org.gen.day3;
interface in
{
	void display(int p);
}
public class Q5 implements in{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Q5 q=new Q5();
           q.display(5);
	}

	@Override
	public void display(int p) {
		// TODO Auto-generated method stub
		for(int i=2;i<=p;i++)
		{
			boolean c=true;
			for(int j=2;j<=p/2;j++)
			{
				if(i%j==0)
				{
					c=false;
					break;
				}
			}
			if(c==true)
			{
				System.out.println(i);
			}
		}
	}

}