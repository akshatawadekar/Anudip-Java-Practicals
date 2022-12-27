package dec22;

import java.util.Scanner;

public class ReverseUpperString {

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter your String");
        StringBuilder s=new StringBuilder();
		s.append(sc.nextLine());
		System.out.println(s.reverse());
		String s1=s.toString();
		System.out.println("Change into upper case  ="+s1.toUpperCase());
	 

	}

}
