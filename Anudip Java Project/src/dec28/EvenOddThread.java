//Create a Thread to find if the number is odd or even

package dec28;

import java.util.Scanner;

public class EvenOddThread
{
	static EvenOdd e=new EvenOdd();
	public static void main(String[] args)
	{
		
		e.start();//two thread
	}

}
class EvenOdd extends Thread //creating thread using class Thread
{
	public void run()//override run()
	{
		int num;		
		System.out.println("Enter Number");
		Scanner s=new Scanner(System.in);  //Creating Scanner Object
		num=s.nextInt();   //taking input from user
		if(num%2==0)  //Checking if no is even
		{
			System.out.println("Number is Even");
		}
		else//print Odd if condition is false
		{
			System.out.println("Number is Odd");
		}
	}
}
