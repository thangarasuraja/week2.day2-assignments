package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Button {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/Button.html");

		//Maximize the window
		driver.manage().window().maximize();
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//click the button to go home page
		
		driver.findElement(By.id("home")).click();
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//again come to actual page
		
		driver.findElement(By.xpath("//h5[text()='Button']")).click();
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//get location
		
		 System.out.println(driver.findElement(By.id("position")).getLocation());
		 
			//Thread sleep
			
			Thread.sleep(2000);
		 
		 //get color
		 
		 String color=driver.findElement(By.id("color")).getCssValue("background-color");
		 
		 System.out.println(color);
		 
			//Thread sleep
			
			Thread.sleep(2000);
		 
		 //get size
		 
		 System.out.println(driver.findElement(By.id("size")).getSize());
		 
			//Thread sleep
			
			Thread.sleep(2000);
			
			//close the browser
			
			driver.quit();
			
			

	}

}
