package AutomationTestingWebsite;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchBox {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
//		Providing string 
		
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Tiger");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
//		Thread.sleep(7000);
		
//		clicking on each link using the loop
		
		List <WebElement> links = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		System.out.println(links.size());
		
		for(WebElement link : links) {
			String Search = link.getAttribute("href");
			System.out.println(Search);
			link.click();
		}
		
//		Getting all window ID's
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
//		closing specific browser window
		
		List<String> listwindows = new ArrayList(ids);
		
		String parentid = listwindows.get(0);
		String Child1 = listwindows.get(1);
		String Child2 = listwindows.get(2);
		String Child3 = listwindows.get(3);
		String Child4 = listwindows.get(4);
		
		Thread.sleep(7000);
		driver.switchTo().window(Child3);
		driver.close();
		
	}

}
