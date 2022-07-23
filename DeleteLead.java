package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

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

		//click phone tab

		driver.findElement(By.linkText("Phone")).click();

		//input the phone number

		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9894613484");

		//Click Find lead button
		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();

		
		//sleep
		Thread.sleep(5000);
		
		//get the lead code
        String leadCode=driver.findElement(By.xpath("(//div[contains (@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).getText();
        System.out.println(leadCode);
        
        //click the first lead
        driver.findElement(By.xpath("(//div[contains (@class,'x-grid3-cell-inner x-grid3-col-partyId')])[1]/a")).click();
        
        //click delete
        driver.findElement(By.linkText("Delete")).click();
        
        //click Find Leads
        driver.findElement(By.linkText("Find Leads")).click();
        
        //enter lead ID
        
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadCode);
        
      //Click Find lead button
      		driver.findElement(By.xpath("(//button[@class='x-btn-text'])[7]")).click();
      		
      		//Thread sleep
      		Thread.sleep(5000);
      		
      		//get no records text
      		
      		String norecords=driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
      		
      		//compare text
      		
      		if(norecords.equalsIgnoreCase("No records to display")) {
      			System.out.println("Verified");
      		}
      		else {
      			System.out.println("There is issue in record deletion");
      		}
      		
      		//close the driver
      		driver.close();
	}

}
