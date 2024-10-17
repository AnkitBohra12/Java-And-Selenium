package Day5Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		
		//getTitle()
		String title = driver.getTitle();
		System.out.println(title);
		
		//getCurrentURL()
		System.out.println(driver.getCurrentUrl());
		
		//getPageSource()
		System.out.println(driver.getPageSource());
		
		//getWindowHandle()
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles()
		driver.findElement(By.xpath("//i[@class='fa 'fa-facebook']")).click();
		
		set<WebElement> list = 
	}

}
