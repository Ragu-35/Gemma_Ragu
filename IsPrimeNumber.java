package week1homework;

public class IsPrimeNumber 
{

	public static void main(String[] args) 
	{
	    int a=45,count = 0;

	    if (a>1) 
		{
	        for (int i=1;i<=a;i++) 
	        {
	            if (a % i == 0) 
	            {
	               count++;
	            }
	        }
	     if (count == 2) 
	        {
	         System.out.println(a + " is a prime number");
	        } 
		else 
		{
	         System.out.println(a + " is NOT a prime number");
	        }
	    } 
		else if (a == 1) 
		{ 
	     System.out.println(a + " is not a prime number");
	    } 
		else 
		{
	      System.out.println("is not a prime number " + a);
	    }
	}
}
