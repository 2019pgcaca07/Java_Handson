Question 2
Create a class named 'Member' having the following members:
Data members
1 - Name
2 - Age
3 - Phone number
4 - Address
5 - Salary
It also has a method named 'printSalary' which prints the salary of the members.
Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and 'Manager' classes have data members 'specialization' and 'department' respectively. Now, assign name, age, phone number, address and salary to an employee and a manager by making an object of both of these classes and print the same
Ans.
package com.org.gen.day2;
class Member
{
	String Namae;
	int age;
	int phno;
	String Address;
	float sal;
}
class Employee extends Member
{
   String specialization;
   
   
}
class Manager extends Member
{
	String Department;
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
