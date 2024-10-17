package Day15Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		scroll down page by pixel number
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeAsyncScript("window.scrollBy(0,500)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
//		scroll the page till element is visible
		
		WebElement ele = driver.findElement(By.xpath(null));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
//		scroll page till end of the page
		js.executeScript("window.scrollBy(0,dcoument.body.scrollHeight");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		Thread.sleep(5000);
		
//		scroll page to initial level
		js.executeScript("window.scrollBy(0, -dcoument.body.scrollHeight");
		System.out.println(js.executeScript("return window.pageYOffset;"));
		
		
		
		
	}

}
