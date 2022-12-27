package dec22;

import java.util.Scanner;

interface Printable
{
	void printable();
}
interface Calculate
{
	int calculate();
}
class CalculateSquare implements Printable,Calculate
{
	public int calculate()
	{
		Scanner sss=new Scanner(System.in);
		int a=sss.nextInt();
		
		return a*a;
	}
	public void printable()
	{
			System.out.println("Enter number to calculate Square");
	}
	
	
	
}
class CalculateCube implements Printable,Calculate
{
	public int calculate()
	{
		System.out.println("Enter Number: ");
		Scanner sss=new Scanner(System.in);
		int a=sss.nextInt();
		return a*a*a;
	}

	public void printable()
	{
		System.out.println("Enter number to calculate cube");
		
	}
	}

public class TwoInterfaceSquareCube 
{

	public static void main(String[] args) 
	{
		
		CalculateSquare cs=new CalculateSquare();
		cs.printable();
		System.out.println("Square of a Number is ="+cs.calculate());
		CalculateCube cc=new CalculateCube();
		cc.printable();
		System.out.println("Cube of the number is ="+cc.calculate());	
	}
		
}
