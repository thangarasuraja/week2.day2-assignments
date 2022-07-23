package week2.day2.assignments.mandatory;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class FaceBook {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Load the URL
		driver.get("https://en-gb.facebook.com/");

		//Maximize the window
		driver.manage().window().maximize();

		driver.findElement(By.xpath("(//div[@class='_6ltg'])[2]/a")).click();
		
		Thread.sleep(5000);

		driver.findElement(By.name("firstname")).sendKeys("maya");

		driver.findElement(By.name("lastname")).sendKeys("narayanan");

		driver.findElement(By.name("reg_email__")).sendKeys("abc@gmail.com");

		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("abc@gmail.com");
		
		driver.findElement(By.id("password_step_input")).sendKeys("Japan@8734%23yy");


		WebElement dropdown =driver.findElement(By.id("day"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("10");


		WebElement dropdown2 =driver.findElement(By.id("month"));
		Select select2=new Select(dropdown2);
		select2.selectByVisibleText("May");
		
		
		WebElement dropdown3 =driver.findElement(By.id("year"));
		Select select3=new Select(dropdown3);
		select3.selectByVisibleText("1997");
		
		driver.findElement(By.className("_58mt")).click();
		
		




	}

}
