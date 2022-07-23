package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		//Maximize the window
		driver.manage().window().maximize();

		//Thread sleep

		Thread.sleep(2000);
		
		//select the training program
		
		WebElement dropdown=driver.findElement(By.id("dropdown1"));
		
		Select select=new Select(dropdown);
		
		select.selectByIndex(1);
		Thread.sleep(5000);
		
		//select by text
		
		WebElement dropdown2=driver.findElement(By.name("dropdown2"));
		
		select.selectByVisibleText("Loadrunner");
		
		//Select by value
		
		WebElement dropdown3=driver.findElement(By.id("dropdown3"));
		
		select.selectByValue("2");
		Thread.sleep(5000);
		
		//count dropdown
		
		WebElement dropdown4=driver.findElement(By.className("dropdown"));
		Thread.sleep(5000);
		
		//slect by send keys
		
		driver.findElement(By.xpath("(//div[@class='example'])[5]/select")).sendKeys("Appium");
		Thread.sleep(5000);
		
		//multiple select
		
		WebElement value1=driver.findElement(By.xpath("(//option[text()='Selenium'])[6]"));
		WebElement value2=driver.findElement(By.xpath("(//option[text()='Appium'])[6]"));
		 Actions action = new Actions(driver);
		action.keyDown(Keys.CONTROL).click(value1).click(value2).build().perform();
		
		Thread.sleep(5000);
		
		//close
		
		driver.quit();

	}

}
