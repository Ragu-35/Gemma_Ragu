package week3.homework;

public class APIClient {
	
	//create two methods with the same name passing different input arguments
	
	public void sendRequestol()
	{
		String b="Hello";
		String c="world";
		System.out.println(b+c);
	}
	public void sendRequest(int a,String b, boolean flag)
	{
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(flag);
		
	}
	
	public String sendRequest(String a, String b)
	{
		
		return (a+" "+b +"!!!");
	}
	
	public static void main(String[] args) 
	{
		APIClient obj= new APIClient();
		obj.sendRequestol();
		obj.sendRequest(5,"ragu", true);
		System.out.println(obj.sendRequest("Test", "leaf")); //take parameter and return value method
	}
	
}
