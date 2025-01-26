package week3.homework;

public class ChangeOddIndexToUppercase {

	public static void main(String[] args) {
		// Change Odd Index To Uppercase - changeme - cHaNgEmE
		
		String a= "changeme";
		char d[] = a.toCharArray();
		int n = a.length();
		String b="";
		
		for( int i=0;i<n;i++)
		{
			if(i%2 != 0)
			{
				b=b+Character.toUpperCase(d[i]);
			}
			else
			{
				b=b+d[i];
			}
					
		}
		
		System.out.println(b);	

	}

}
