package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/Link.html");

		//Maximize the window
		driver.manage().window().maximize();

		//Thread sleep

		Thread.sleep(2000);

		//Goto home page

		driver.findElement(By.linkText("Go to Home Page")).click();

		//Thread sleep

		Thread.sleep(2000);

		//Return to same page

		driver.findElement(By.linkText("HyperLink")).click();

		//Thread sleep

		Thread.sleep(2000);

		//find the url without click the link

		String expectedurl=driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href");

		System.out.println(expectedurl);

		//Thread sleep

		Thread.sleep(2000);

		//interact with same name


		driver.findElement(By.xpath("(//div[@class='large-6 small-12 columns'])[4]/a")).click();

		//Thread sleep

		Thread.sleep(2000);

		//Return to same page

		driver.findElement(By.linkText("HyperLink")).click();

		//Thread sleep

		Thread.sleep(2000);
		
		//number of links in page
		
		int numberOfLinks = driver.findElements(By.tagName("a")).size();
		
		System.out.println("numberoflinks:"+numberOfLinks);
		
		//Thread sleep

		Thread.sleep(2000);
		
		//close
		
		driver.quit();



	}

}
