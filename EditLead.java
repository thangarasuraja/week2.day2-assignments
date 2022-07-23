package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://leaftaps.com/opentaps/control/login");

		//Maximize the window
		driver.manage().window().maximize();

		//Enter the user name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");

		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		//Click the Login button
		driver.findElement(By.className("decorativeSubmit")).click();

		//click the CRM/SFA link
		driver.findElement(By.linkText("CRM/SFA")).click();

		//click the Leads tab
		driver.findElement(By.linkText("Leads")).click();

		//click the Find Leads link
		driver.findElement(By.linkText("Find Leads")).click();

		//Enter the First name 

		driver.findElement(By.xpath("(//div[@class='x-form-element'])[19]/input")).sendKeys("Thangarasu");

		//Click Find lead button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();

		//Thread
		Thread.sleep(3000);

		//click the first record
		driver.findElement(By.xpath("(//div[contains (@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();

		//Get the title

		String resultTitle=driver.getTitle();

		//compare the title
		String ExpectedTitle="View Lead | opentaps CRM";
		if(resultTitle.equalsIgnoreCase(ExpectedTitle)) {
			System.out.println("Title is valid");
		}
		else {
			System.out.println("It is invalid title"+resultTitle);
		}

        //Click Edit button
		
		driver.findElement(By.linkText("Edit")).click();
		
		//Edit the comapny name
		
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("ZOHO");
		
		//click update
		
		driver.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();
		
		//get the company name
		
		String text=driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		//split the numericvalue and company name 
		
		String companyname=text.replaceAll("[^a-zA-Z]", "");
		
		System.out.println("Companyname = "+companyname);
		
		//compare the title
		
		if(companyname.equalsIgnoreCase("ZOHO")) {
			System.out.println("Valid company name updated");
		}
		else {
			System.out.println("invalid company name updated");
		}
		
		//Thread sleep
		
		Thread.sleep(5000);
				
		//close the browser
		
		driver.quit();		
		
		
		
		
		
		
		
		

	}

}
