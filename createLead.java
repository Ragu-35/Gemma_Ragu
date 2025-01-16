package week2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class createLead {

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
		//click on the leads
		driver.findElement(By.linkText("Leads")).click();
		//Click on the "Create Lead" button
		driver.findElement(By.partialLinkText("Create Lead")).click();
		//Enter a FirstName.
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Tikshitha");
		//Enter a LastName
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Raguraman");
		//Enter a CompanyName.
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Cognizant");
		//Enter a Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Associate");
		//Click the "Create Lead" button.
		driver.findElement(By.className("smallSubmit")).click();
		//title
		String title = driver.getTitle();
		System.out.println(title);
		//wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//close
		driver.close();
		
	}

}
