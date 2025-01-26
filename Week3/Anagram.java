package week3.homework;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Define two input strings.
		String a="stops";
		String b="potas";
		
		
		//Check if the lengths of the two strings are equal
		if(a.length()==b.length())
		{
			System.out.println("Both string length are equal & its a Anagram");
		}
		else
		{
			System.out.println("Lengths mismatch - Not a Anagram");
		}
		
		//Convert both the strings to character arrays
		char c[]= a.toCharArray();
		char d[]= b.toCharArray();
		
		//Sort both the character arrays
		Arrays.sort(c);
		Arrays.sort(d);
		
		//Check if the sorted arrays are equal
		
		if(c==d)
		{
			System.out.println("The given strings are Anagram");
		}
		else
		{
			System.out.println("The given strings are not an Anagram");
		}
	}

}
