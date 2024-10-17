package AutomationTestingWebsite;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class VerifyingTitle {

	public static void main(String[] args) {
				
				WebDriver driver = new ChromeDriver();	
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));

//				WebDriver dri = new EdgeDriver();

				driver.get("https://testautomationpractice.blogspot.com/");
//				dri.get("https://testautomationpractice.blogspot.com/");
				driver.manage().window().maximize();
				
//				verifying the title of the page 
				String actual_title = "GUI Elements";
				
				String title = driver.findElement(By.xpath("//a[normalize-space()='GUI Elements']")).getText();
				System.out.println(title);
					
				if (actual_title == title) {
					System.out.println("Tittle Matched");
					}
				else {
					System.out.println("Not Matched");
				}
				
				
//				second approach 
				
				String GetTitle = driver.getTitle();
				System.out.println(GetTitle);
				String ActualTitle = "Automation Testing Practice";
				
				System.out.println(GetTitle.contentEquals(ActualTitle));
				
				driver.close();
	}

}
