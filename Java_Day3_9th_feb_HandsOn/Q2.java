Question 2
Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150
and $200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and
'BankC' are subclasses of class 'Bank', each having a method named
'getBalance'. Call this method by creating an object of each of the three classes.
Ans.
package com.org.gen.day3;

abstract class Bank
{
 protected int balance;
 void deposit (int money)
 {
 balance += money;
 }
 abstract int getBalance ();
}
class BankA extends Bank
{
 @Override int getBalance ()
 {
 return balance;
 }
}
class BankB extends Bank
{
 @Override int getBalance ()
 {
 return balance;
 }
}
class BankC extends Bank
{
 @Override int getBalance ()
 {
 return balance;
 }
}
public class Q2
{
 public static void main (String[]args)
 {
 BankA bankA = new BankA ();
 BankB bankB = new BankB ();
 BankC bankC = new BankC ();
 bankA.deposit (100);
 bankB.deposit (150);
 bankC.deposit (200);
 System.out.println ("Balance of Bank A = $" + bankA.getBalance ());
 System.out.println ("Balance of Bank B = $" + bankB.getBalance ());
 System.out.println ("Balance of Bank C = $" + bankC.getBalance ());
 }
}