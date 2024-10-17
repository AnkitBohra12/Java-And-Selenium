package Day14Selenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class OpenLinkInNewTabWithKeyboard {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://medimention.com/");
		driver.manage().window().maximize();
		
		WebElement regLink = driver.findElement(By.xpath("//a[text()='Home']"));
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).click(regLink);
		
//		switch the driver to other tab
		
//		Set<String> windis = driver.getWindowHandles();
		
		List<String> listIds = new ArrayList(driver.getWindowHandles());
		
		String parentid = listIds.get(0);
		String childid = listIds.get(1);
		
		driver.switchTo().window(childid);
		driver.findElement(By.xpath("//a[@text()='Join Us']")).click();
		
		driver.switchTo().window(parentid);
		driver.findElement(By.xpath("//a[@text()='About']")).click();

		
	}

}
