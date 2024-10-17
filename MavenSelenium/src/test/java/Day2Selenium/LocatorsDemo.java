package Day2Selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://tutorialsninja.com/demo/");	
		driver.manage().window().maximize();
		
		// Name locator
		WebElement search  = driver.findElement(By.name("search")); //sendKeys("Devices");
		search.sendKeys("Computers");
		Thread.sleep(1000);
		search.clear();
		Thread.sleep(2000);
		search.sendKeys("Cloths");
		
		
		
		// ID locator
		boolean logostatus = driver.findElement(By.id("logo")).isDisplayed();
		System.out.println(logostatus);
		
		
		// Linktext locator
		driver.findElement(By.linkText("Components")).click();
		
		
		// PartialLinktext locator
		driver.findElement(By.partialLinkText("Laptops & ")).click();
		
		
		
		driver.close();		
		
	}

}
