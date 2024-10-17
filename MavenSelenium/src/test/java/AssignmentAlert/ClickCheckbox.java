package AssignmentAlert;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickCheckbox {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		List<WebElement> week = driver.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]//input[@type=\"checkbox\"]"));
		System.out.println(week.size());
		
		int i=0;
		
		while(i<week.size()) {
			i++;
			week.get(i).click();
		}
	}

}
