package Day11Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[conatins(@class,'multiselect']")).click();
		
//		Select single option
		driver.findElement(By.xpath("/input[@value='python']")).click();
		
//		Capturing all the options 
		List<WebElement> bootoptions = driver.findElements(By.xpath("//ul[conatins(@class,'multiselect')]//label[@class='checkbox']"));
		System.out.println(bootoptions.size());
		
		for(WebElement options : bootoptions) {
			System.out.println(options.getText());
		}
	}

}
