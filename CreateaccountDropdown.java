package week2.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateaccountDropdown {

	public static void main(String[] args) {
		
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
		driver.findElement(By.id("accountName")).sendKeys("Vasudevan"); //id- account name contains multiple
		//update the description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//driver.findElement(By.className("inputBox")).sendKeys("Selenium Automation Tester"); //have to check why its not working
		//no.of size
		driver.findElement(By.id("numberEmployees")).sendKeys("5");
		//site.name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//finding the source
		WebElement Sourcedd = driver.findElement(By.name("industryEnumId"));
		
		//object for select
		Select dd = new Select(Sourcedd);
		//Select "ComputerSoftware" as the industry - drop down
		dd.selectByIndex(4); //index is used
		
		//Select "S-Corporation" as ownership using SelectByVisibleText - Drop down
		WebElement ownerDD = driver.findElement(By.name("ownershipEnumId"));
		Select dd1 = new Select(ownerDD);
		dd1.selectByVisibleText("S-Corporation");
		
		//Select "Employee" as the source using SelectByValue -drop down
		WebElement Empdd = driver.findElement(By.id("dataSourceId"));
		Select dd2= new Select(Empdd);
		dd2.selectByValue("LEAD_EMPLOYEE");
		
		//Select "eCommerce Site Internal Campaign" as the marketing campaign using SelectByIndex - drop down
		WebElement campdd = driver.findElement(By.id("marketingCampaignId"));
		Select dd3 =new Select(campdd);
		dd3.selectByIndex(6);
		
		//Select "Texas" as the state/province using SelectByValue
		WebElement locdd = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select dd4=new Select(locdd);
		dd4.selectByValue("TX");
		
		//click on create account button
		driver.findElement(By.className("smallSubmit")).click();
		
		//printing the title using object
		String title = driver.getTitle();
		System.out.println(title);
		
		//closing the browser
		driver.close();

	}

}
