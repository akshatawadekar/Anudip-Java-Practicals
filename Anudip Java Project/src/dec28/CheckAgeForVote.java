//Write a program take a input from the age  the user if the age is above 18 print "you are eligible 
//to  vote  else throw an ecepation that age is not correct.

package dec28;
import java.util.*;

public class CheckAgeForVote 
{

	public static void main(String[] args)
	{
		int age ;
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter your age");
	    age=sc.nextInt();
	    try {
	    
	    	if(age>=18)
	  
		    System.out.println("You are eligible for voting, because your age is "+age+" greater than 18");
	    	else 
	    	{
	    		throw new Exception("You are not eligible for vote because your age is "+age+" less than 18");
	    	}
	    		
	    	
	    }
	    catch(Exception e)
	    {
	     System.out.println(e);
	    
	    
		   
	    }

	}

}
