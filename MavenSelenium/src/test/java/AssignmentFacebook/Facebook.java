package AssignmentFacebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@role=\"button\"]//parent::div[@class=\"_6ltg\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ankit");	
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@type='text']//parent::div/child::div[text()='Surname']")).sendKeys("Bohra");
		
		
		/*Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@name='reg_email__']//self::input")).sendKeys("1234567890");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='password']//self::input//parent::div//div[@class='placeholder']")).sendKeys("Ankit");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//select[@name='birthday_day']//child::option[11]")).click(); */
		

	}

}
