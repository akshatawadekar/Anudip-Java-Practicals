package dec28;

import java.util.Scanner;

public class ExceptionHandling 
{

	public static void main(String[] args)
	{
		int i,j;
		try
		{
			Scanner sc=new Scanner(System.in); //Creating Scanner object to take input
			System.out.println("enter the first number");
			i=sc.nextInt(); //First no. input
			System.out.println("enter the second number");
			j=sc.nextInt();  //Second no. input
			System.out.println(i/j);   //calculating and printing the calculation
			System.out.println("Exception not occured");
		}
		catch(Exception e)   //Handling Exception
		{
			System.out.println(e);  //print exception
		}
		System.out.println("Done");

		

	}

}
