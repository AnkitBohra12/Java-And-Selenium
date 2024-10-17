package Day10Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
//		Normal alret with ok button
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Thread.sleep(4000);
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();
		
//		Confirmation alert -- ok alert
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Thread.sleep(4000);
		myalert.accept();
		myalert.dismiss();			// works when accept is commented 
		
//		Prompt alert --- input box alert
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		myalert.sendKeys("Welcome to selenium");
		Thread.sleep(4000);
		myalert.accept();
	}

}
