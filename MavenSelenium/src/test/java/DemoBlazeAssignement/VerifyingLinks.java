package DemoBlazeAssignement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingLinks {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		
		  List <WebElement> links = driver.findElements(By.tagName("a"));
		  
//		  Number of links present in website
		  System.out.println("Number of Links : " + links.size());
		  
//		  Printing all the links  
		  for (WebElement link : links) {
              String url = link.getAttribute("href");
              System.out.println(url);        
		  }
	}
}
