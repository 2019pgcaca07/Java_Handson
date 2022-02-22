Question 4
- a) Write a statement that declares a string array initialized with the following strings:
"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" and "Saturday".
b) Write a loop that displays the contents of each element in the array that you declared

Ans.
package com.org.gen.day2;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String arr[]= {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
	    for(int i=0;i<7;i++)
	    {
	    	System.out.println(arr[i]);
	    }
	}

}