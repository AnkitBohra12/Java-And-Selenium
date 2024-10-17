package Day13Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Cypress");
		
		List<WebElement> listCypress = driver.findElements(By.xpath("//ul[@class='G43f7e']/child::li"));
		
		WebElement clickele = driver.findElement(By.xpath("//ul[@class='G43f7e']/child::li[3]"));
		System.out.println(clickele.getText());
		clickele.click();
		
		
		

	}

}
