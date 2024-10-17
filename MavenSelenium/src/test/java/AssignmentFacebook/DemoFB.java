package AssignmentFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoFB {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.facebook.com/");
	        driver.manage().window().maximize();
	        
	        
	        driver.findElement(By.xpath("//a[contains(text(),'Create new account')]")).click();
	        Thread.sleep(3000);
	        
	        driver.findElement(By.name("firstname")).sendKeys("Ankit");
	        Thread.sleep(3000);
	        
	        driver.findElement(By.name("lastname")).sendKeys("Bohra"); 

	}

}
