package Day4Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com");
		driver.manage().window().maximize();
		
		// Xpath with single attribute
		WebElement txtsearch = driver.findElement(By.xpath("//input[@name='search']"));
		txtsearch.sendKeys("Mobile phones");
		Thread.sleep(3000);
		txtsearch.clear();
		
		//Xpath with mutltiple attribute
		driver.findElement(By.xpath("//input[@name='search'][@placeholders='Search'")).sendKeys("Computers");
		
		//Xpath with and operator
		driver.findElement(By.xpath("//input[@name='search' and @placeholders='Search'")).sendKeys("Mouse");
		
		//Xpath with OR operator
		driver.findElement(By.xpath("//*[@type='text' or @type='button'")).sendKeys("system");
		
		List<WebElement> element = driver.findElements(By.xpath("//*[@type='text' or @type='button'"));
		System.out.println(element.size());
		
		// Xpath with inner text -- text()
	}

}
