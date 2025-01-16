package week2.homework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
				
		//Click on the Create new account button
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		//Enter the First name
		driver.findElement(By.name("firstname")).sendKeys("Ragu");
		
		//Enter the Surname
		driver.findElement(By.name("lastname")).sendKeys("Vasu");
		
		//Enter the Mobile number or email address.
		driver.findElement(By.name("reg_email__")).sendKeys("8925506565");
		
		//Enter the New password.
		driver.findElement(By.name("reg_passwd__")).sendKeys("1234568788");
		
		// Handle all three dropdowns in Date of birth
		
		WebElement dob = driver.findElement(By.name("birthday_day")); //value is used
		Select dd=new Select(dob);
		dd.selectByValue("30");
	
		WebElement month = driver.findElement(By.name("birthday_month")); //index value used
		Select dd1 =new Select(month);
		dd1.selectByIndex(8);
		
		WebElement year = driver.findElement(By.name("birthday_year")); //visible text used
		Select dd2=new Select(year);
		dd2.selectByVisibleText("1990");		
		
		//Select the radio button in Gender
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click(); //- need to know why its not happening
		
		/* WebElement male = driver.findElement(By.xpath((//input[@type='radio']))[2]));
		male.click();
		
		// driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		
		Syntax:
			(//tagName[@attribute='attributeValue'])[index]
			Example
			(//input[@class='inputLogin'])[2]
		*/
	}


}
