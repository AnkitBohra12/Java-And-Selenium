package Day16Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTablePagination {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://demo.opencart.com/admin/");
		driver.manage().window().maximize();
		
		WebElement usertxt = driver.findElement(By.xpath("//input[@id='input-username']"));
		usertxt.clear();
		usertxt.sendKeys("demo");
		
		
		WebElement userpass = driver.findElement(By.xpath("//input[@id='input-password']"));
		userpass.clear();
		userpass.sendKeys("demo");
		
		
		driver.findElement(By.xpath("//*[@id=\"form-login\"]/div[3]/button"));
		driver.findElement(By.xpath("//a[@class='parent']")).click();
		
	}

}
