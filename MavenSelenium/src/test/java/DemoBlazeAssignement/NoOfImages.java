package DemoBlazeAssignement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfImages {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		 List <WebElement> Images = driver.findElements(By.xpath("//img"));
		 System.out.println("Number of images : " + Images.size());
			
			
		
	}
}
