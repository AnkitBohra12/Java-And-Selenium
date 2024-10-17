package AutomationTestingWebsite;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingGUIElements {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		 Name
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ankit");
		
//		Email
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankit@abc.com");
		
//		Number
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
		
//		Address
		driver.findElement(By.xpath("//textarea[@id='textarea']")).sendKeys("Delhi,India");
		
//		Gender
		driver.findElement(By.xpath("//input[@id='male']")).click();
		
//		checking all check box are working or not 
		List<WebElement> week = driver.findElements(By.xpath("//div[@class=\"form-check form-check-inline\"]//input[@type=\"checkbox\"]"));
		System.out.println(week.size());
				
		for(WebElement weeks : week) {
			
			String checkbox = weeks.getAttribute("value");
			System.out.println(checkbox);
			}
		
//		selecting all weeks
		for(int i=0; i<week.size(); i++) {
			week.get(i).click();
		}
		
//		for each loop
		for(WebElement list : week) {
			list.click();
		}
		
//		selecting 3 check box
		for(int i=week.size()-1; i>=week.size()-4;i--) {
			week.get(i).click();
		}
		
//		click on those check box we have to check
		for(int i=0; i<week.size(); i++) {
			if(week.get(i).isSelected()) {
				continue;
			}
			else {
				week.get(i).click();
			}
		}
		
		
		
		driver.close();
		}
	}

