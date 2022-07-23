package week2.day2.assignments.mandatory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://www.leafground.com/pages/table.html");

		//Maximize the window
		driver.manage().window().maximize();

		//Thread sleep

		Thread.sleep(2000);
		
		//No of columns
		
		
		List <WebElement> col = driver.findElements(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/table/tbody/tr[1]/th"));
        System.out.println("No of cols are : " +col.size());
        
        
      //No.of rows 
        List <WebElement> rows = driver.findElements(By.xpath("//*[@id=\\\"contentblock\\\"]/section/div[1]/table/tbody/tr/td[1]")); 
        System.out.println("No of rows are : " + rows.size());
        driver.close();

	}

}
