package week3.homework;

public class ReverseOddWordsinaString {

	public static void main(String[] args) {
		// String test = "I am a software tester";
		//Expected output: “I ma a erawtfos tester”
		
		String test = "I am a software tester";
		String b="";
		
		//Split the words and have it in an array
		String str[] = test.split(" ");
		int n = str.length;
		
		//Traverse through each word using loop
		for (int i=0;i<n;i++)
		{
			if(i%2==0) //loop - Find the odd index within the loop
			{
				b=b+" "+str[i];
			}
			else 	//Print the even position words in reverse order using nested loop
			{
				//even position - reversing
				char[] charArray = str[i].toCharArray();
				int m=charArray.length;
				String c="";
				for(int j=m-1;j>=0;j--)
				{
				c=c+charArray[j];	
				}
				b=b+" "+c ;
						
			}
		}
		
		System.out.println(b);
	
		
		
	}

}
