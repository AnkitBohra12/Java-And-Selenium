package AutomationTestingWebsite;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerfyingNoOfCountries {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List <WebElement> Country = mywait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//select[@id=\"country\"]/option")));
		System.out.println(Country.size());
		
		for(WebElement Countries : Country) {
			String Name = Countries.getAttribute("Value");
			System.out.println(Name);
		}		
		driver.close();
	}
}
