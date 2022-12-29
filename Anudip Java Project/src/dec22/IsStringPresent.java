package dec22;

import java.util.Scanner;

public class IsStringPresent {

	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner (System.in); // Creating Object of Scanner class to take input
			System.out.println("Enter your two Strings");
			String st1=sc.nextLine(); // First String input
			String st2=sc.nextLine(); //Second String input
			//System.out.println(str1.contains(str2));
			if(st1.contains(st2)) // Checking is String1 contains another String 
			{
				System.out.println("First String Contains another String");
			}
			else if (st2.contains(st1))// Checking is String2 contains string1 
			{
				System.out.println("Second String Contains First String");
			}
			else //if both condition false then enters in this block
			{
				System.out.println("Strings dont exists in another");
			}

		
	}

}
