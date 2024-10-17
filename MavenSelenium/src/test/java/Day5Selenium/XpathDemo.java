package Day5Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		
		// Xpath with contains()wd
		driver.findElement(By.xpath("//input[contains(@placeholder,'Your Name')]")).sendKeys("John snow");

		// Xpath with start-with
		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Your P')]")).sendKeys("78945122");
		
	}

}
