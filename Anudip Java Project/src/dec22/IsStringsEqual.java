package dec22;

import java.util.Scanner;

public class IsStringsEqual {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two strings");
		System.out.println("Enter First String");
		String f=sc.nextLine();
	    String s=sc.nextLine();
		if(f.equals(s))
		{
			System.out.println("Both Strings '"+f+"' and '"+s+ "' are same.");
		}
		else
		{
			System.out.println("These Strings '"+f+"' and '"+s+"' are not same.");
		}

	}

}
