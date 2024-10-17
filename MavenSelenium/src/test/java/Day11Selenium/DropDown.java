package Day11Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropCountry = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drpctry = new Select(dropCountry);
		
		drpctry.selectByValue("australia");
		drpctry.selectByIndex(2);
		drpctry.selectByVisibleText("India");
		
//		Capture the options from the dropdown
		List<WebElement> options = drpctry.getOptions();
		System.out.println("Number of options in a dropdown " + options.size());
		
		for(int i=0; i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}
	}

}
