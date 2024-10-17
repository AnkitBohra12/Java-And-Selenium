package Day12Selenium;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button = driver.findElement(By.xpath("//span[@class='context-menu one btn btn-netural']"));
		
		Actions act = new Actions(driver);
		
		//right click operations
		act.contextClick(button).perform();
		
		//click on copy
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
		
		//accept alert
		driver.switchTo().alert().accept();
		
		
	}

}
