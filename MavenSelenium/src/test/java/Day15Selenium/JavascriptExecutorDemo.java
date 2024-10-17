package Day15Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement inputTxt = driver.findElement(By.xpath("//input[@id='name']"));
		
//		passing text into inputbox - alternate of sendkeys()
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','John')", inputTxt);
		Thread.sleep(4000);
		
//		clicking on any web element - alternate for click operation
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='male']"));
		js.executeAsyncScript("argument[0].click()", radioButton);
		
		

	}

}
