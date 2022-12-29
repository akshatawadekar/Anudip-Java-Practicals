package dec22;

import java.util.Scanner;

public class IsStringsEqual {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);   // Creating Object of Scanner class to take input
		System.out.println("Enter two strings");
		System.out.println("Enter First String");
		String f=sc.nextLine();   // First String input
	    String s=sc.nextLine();   //Second String input
		if(f.equals(s))   // Checking is Strings are equal or not
		{
			System.out.println("Both Strings '"+f+"' and '"+s+ "' are same.");
		}
		else     //if condition is false then enters to else
		{
			System.out.println("These Strings '"+f+"' and '"+s+"' are not same.");
		}

	}

}
