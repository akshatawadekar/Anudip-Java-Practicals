package dec22;

import java.util.Scanner;

interface Printable  // Interface
{
	void printable(); //Abstract method
}
interface Calculate   //Interface
{
	int calculate();     //Abstract method
}
class CalculateSquare implements Printable,Calculate     //implement interfaces in class
{
	public int calculate()  // Override Interface abstract method
	{
		Scanner sss=new Scanner(System.in);    //Input
		int a=sss.nextInt();
		
		return a*a;
	}
	public void printable()  // Override Interface abstract method
	{
			System.out.println("Enter number to calculate Square");
	}
	
	
	
}
class CalculateCube implements Printable,Calculate      //implement interfaces in class
{
	public int calculate()      // Override Interface abstract method
	{
		System.out.println("Enter Number: ");
		Scanner sss=new Scanner(System.in);    //Input
		int a=sss.nextInt();
		return a*a*a;
	}

	public void printable()       // Override Interface abstract method
	{
		System.out.println("Enter number to calculate cube");
		
	}
	}

public class TwoInterfaceSquareCube // class with main method
{

	public static void main(String[] args) 
	{
		
		CalculateSquare cs=new CalculateSquare();  // Object Creation
		cs.printable();    //calling overriding method 
		System.out.println("Square of a Number is ="+cs.calculate());//print square by calling overriden method
		CalculateCube cc=new CalculateCube();   // Object Creation
		cc.printable();     //calling overriding method
		System.out.println("Cube of the number is ="+cc.calculate()); //print square by calling overriden method
	}
		
}
