package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createaccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/.");
		driver.manage().window().maximize();
		//username: demosalesmanager //password: crmsfa
		//updating the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//updating the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		// click on the "Login" button
		driver.findElement(By.className("decorativeSubmit")).click();
		// click on the "CRM/SFA" link
		driver.findElement(By.partialLinkText("CRM")).click();
		//Click on the "Accounts" tab
		driver.findElement(By.linkText("Accounts")).click();
		//Click on the "Create Account" button
		driver.findElement(By.partialLinkText("Create Account")).click(); //multiple are there in the create account. class text having 22.
		//entering the account name
		driver.findElement(By.id("accountName")).sendKeys("Raguraman V"); //id- account name contains multiple
		//update the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester");
		//no.of size
		driver.findElement(By.id("numberEmployees")).sendKeys("3");
		//site.name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//click on create account button
		driver.findElement(By.className("smallSubmit")).click();
		//printing the title using object
		String title = driver.getTitle();
		System.out.println(title);
		//closing the browser
		driver.close();

	}

}
