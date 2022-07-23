package week2.day2.assignments.mandatory;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//Launch the chrome browser
		ChromeDriver driver=new ChromeDriver();

		//Load the URL
		driver.get("http://leafground.com/pages/checkbox.html");

		//Maximize the window
		driver.manage().window().maximize();

		//Thread sleep

		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='checkbox']")).click();


		Thread.sleep(2000);

		//check box check

		boolean isSelected=driver.findElement(By.xpath("(//div[@class='example'])[2]")).isSelected();

		if(isSelected) {
			System.out.println("Check box seleted");
		}
		else {
			System.out.println("check box not selected");
		}

		Thread.sleep(2000);

		//Deselect only checked

		driver.findElement(By.xpath("(//label[text()='DeSelect only checked']/following::input)[2]")).click();

		Thread.sleep(2000);

		//click all

		driver.findElement(By.xpath("//label[text()='Select all below checkboxes ']/following::input")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[2]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[3]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[4]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[5]")).click();
		driver.findElement(By.xpath("(//label[text()='Select all below checkboxes ']/following::input)[6]")).click();
		Thread.sleep(5000);

		//close the browser

		driver.quit();
	}
}
