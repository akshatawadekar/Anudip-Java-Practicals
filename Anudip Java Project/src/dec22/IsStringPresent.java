package dec22;

import java.util.Scanner;

public class IsStringPresent {

	public static void main(String[] args) 
	{
		
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter your two Strings");
			String st1=sc.nextLine();
			String st2=sc.nextLine();
			//System.out.println(str1.contains(str2));
			if(st1.contains(st2))
			{
				System.out.println("First String Contains another String");
			}
			else if (st2.contains(st1))
			{
				System.out.println("Second String Contains First String");
			}
			else
			{
				System.out.println("Strings dont exists in another");
			}

		
	}

}
