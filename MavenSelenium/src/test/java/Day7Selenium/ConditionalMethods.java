package Day7Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
		
		// isDisplayed()
		WebElement title = driver.findElement(By.xpath("//h1[@class='title']"));
		System.out.println(title.isDisplayed());
		
		// isEnabled()
		WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
		System.out.println(email.isEnabled());
		
		// isSelected(
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='wednesday']"));
		System.out.println(checkbox.isSelected());
		checkbox.click();
		System.out.println(checkbox.isSelected());
		
		driver.close();
		driver.quit();
		
	}

}
