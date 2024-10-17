package Day12Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://firstcrystore.in");
		driver.manage().window().maximize();
		
		
		
		WebElement accessories = driver.findElement(By.xpath("//div[conatins(@class,'top-c')]"));
		WebElement cot = driver.findElement(By.xpath("//div[conatins(@class,'y-gap hover-product-list')]"));
		
		Actions act = new Actions(driver);
		
		// Mouse Hover
		act.moveToElement(accessories).moveToElement(cot).perform();
		

	}

}
