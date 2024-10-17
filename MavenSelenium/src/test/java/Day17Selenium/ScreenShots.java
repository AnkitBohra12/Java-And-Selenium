package Day17Selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShots {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
//		full page screenshot
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File sourcefile = ts.getScreenshotAs(OutputType.FILE);
		
		File targetfile = new File(System.getProperty("user.dir")+"\\ScreenShot\\fullPage.png");
		sourcefile.renameTo(targetfile);
		
//		capture screenshot of specific section
		WebElement section = driver.findElement(By.xpath("//div[@id='HITML1']"));
		
		File sourcefile1 = section.getScreenshotAs(OutputType.FILE);
		File targetfile1 = new File(System.getProperty("user.dir") + "\\ScreenShot\\sectionPage.png");
		sourcefile1.renameTo(targetfile1);
		
//		capture a web element
		
	}

}
