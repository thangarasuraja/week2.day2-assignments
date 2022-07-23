package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Image {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/Image.html");

		//Maximize the window
		driver.manage().window().maximize();

		//Thread sleep

		Thread.sleep(2000);

		//Goto home page

		driver.findElement(By.cssSelector("img[src=\"../images/home.png\"]")).click();
		//Thread sleep

		Thread.sleep(2000);

		//Return to same page

		driver.findElement(By.linkText("Image")).click();
		
		//Thread sleep

		Thread.sleep(2000);
		
		//click by mouse or key board
		
		WebElement element=driver.findElement(By.xpath("//img[@src='../images/keyboard.png']"));
		
		Actions action=new Actions(driver);
		
	    action.moveToElement(element).click();
	    
	    Thread.sleep(3000);
		
		
		
	
		


	}

}
