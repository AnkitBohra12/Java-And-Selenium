package Day3Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3Assignment {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("img[title=\"MacBook\"]")).click();
		driver.findElement(By.cssSelector("button-cart")).click();
	}

}
