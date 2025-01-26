package week3.homework;

public class ArrayFindintersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={3,2,11,4,6,7};
		int b[]= {1,2,8,4,9,7};
		int n=a.length;
		int m=b.length;
		
		for (int i = 0; i <n; i++) 
		{
			for (int j = 0; j < m; j++) 
			{
				//Compare both the arrays using a conditional statement
				
				if(a[i]==b[j])
				{
					System.out.println(a[i]); // Print the value from first array when there is a match
				}
			}
		}
		
	}

}
