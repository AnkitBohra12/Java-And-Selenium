package Day14Selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
//		selenium 4
//		open new tab
		driver.switchTo().newWindow(WindowType.TAB);
		
//		open new window
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("www.google.com");

	}

}
