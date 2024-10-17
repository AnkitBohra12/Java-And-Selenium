package Day9Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> windowids = driver.getWindowHandles();
		
		// Approach 1
		List<String> listwindowids = new ArrayList(windowids);
		
		String parentid = listwindowids.get(0);
		String childid = listwindowids.get(1);
		
		System.out.println(driver.getCurrentUrl());
		
		// Switching to child window
		driver.switchTo().window(childid);
		System.out.println(driver.getCurrentUrl());
		
		// Switch to parent window 
		driver.switchTo().window(parentid);
		System.out.println(driver.getCurrentUrl());
		
		// Approach 2
		
		for(String win : windowids) {
			String title = driver.switchTo().window(win).getTitle();
			System.out.println(title);
		}		
	}
}
