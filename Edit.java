package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/Edit.html");

		//Maximize the window
		driver.manage().window().maximize();
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//Enter the email
		
		driver.findElement(By.id("email")).sendKeys("thangamlee@gmail.com");
		
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//Append a text
		
		String text=driver.findElement(By.xpath("(//input[@type='text'])[2]")).getAttribute("value");
		
		System.out.println(text);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("the good text",Keys.TAB);
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//get the default text
		
		String defaultText=driver.findElement(By.xpath("(//input[@type='text'])[3]")).getAttribute("value");
		
		System.out.println(defaultText);
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//Clear the text
		
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).clear();
		
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		//enable check
		
		boolean enabled=driver.findElement(By.xpath("(//input[@type='text'])[5]")).isEnabled();
		if(enabled) {
			System.out.println("Text field enabled");
		}
		else {
			System.out.println("Text field disabled");
		}
		
		//Thread sleep
		
		Thread.sleep(2000);
		
		driver.quit();

	}

}
