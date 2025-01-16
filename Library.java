package week2.homework;

public class Library {
	
	public String addBook(String a)
	{
		System.out.println("Book added successfully " + a);
		return a;

	}

	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) 
	{
		
		Library a =new Library();
		a.addBook("The Monk who sold his Ferrari");
		a.issueBook();
	}

}
