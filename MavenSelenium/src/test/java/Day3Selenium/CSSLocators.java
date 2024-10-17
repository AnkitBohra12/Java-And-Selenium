package Day3Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		
		//tag ID
		driver.findElement(By.cssSelector("input#banner-name")).sendKeys("Smith");
	
		//tag class name
		List<WebElement> listele = driver.findElements(By.cssSelector("input.form-control"));
		System.out.println(listele.size());
		
		//tag attribute
		driver.findElement(By.cssSelector("input[name=\"email\"]")).sendKeys("smith.john@xyz");
		
		//tag class attribute
		driver.findElement(By.cssSelector("input.form-control[placeholder='Your Phone Number']")).sendKeys("123");
		
		
		
	}

}
