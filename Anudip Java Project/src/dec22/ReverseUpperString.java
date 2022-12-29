package dec22;

import java.util.Scanner;

public class ReverseUpperString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);    // Creating Object of Scanner class to take input
		System.out.println("Enter your String");
        StringBuilder s=new StringBuilder();  //Creating object of StringBuilder class
		s.append(sc.nextLine());    //  Appending the value
		System.out.println(s.reverse());   // Reversing String
		String s1=s.toString();
		System.out.println("Change into upper case  ="+s1.toUpperCase()); //printing the reverse string to upper cae
	 

	}

}
