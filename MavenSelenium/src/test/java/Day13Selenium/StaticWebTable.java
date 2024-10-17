package Day13Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWebTable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr")).size();
		int col = driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr/th")).size();
		
		for(int r=1; r<=rows ; r++) {	
			for(int c=1; c<=col ; c++) {
				if(r==1) {
					String texthead = driver.findElement(By.xpath("	"+r+"]/td["+c+"]""));
					System.out.println(texthead + "/t");
				}
			}
			
			System.out.println();
		}
	}

}
