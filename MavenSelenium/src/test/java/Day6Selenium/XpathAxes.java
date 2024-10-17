package Day6Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.tools.javac.util.List;

public class XpathAxes {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		driver.manage().window().maximize();
		
		// self node
		driver.findElement(By.xpath("//a[conatins(text(),'Dilip Buildcon Ltd.')]//self::a")).click();
		
		
		// parent node
		String txt = driver.findElement(By.xpath("//a[conatins(text(),'Dilip Buildcon Ltd.')]//parent::td")).getText();
		System.out.println(txt);
		
		// child 
		//List<WebElement> child = driver.findElement(By.xpath("//a[conatins(text(),'Dilip Buildcon Ltd.')]//ancestor::tr/child::"))
		//System.out.println(child.size());
		
		//ancestor
		String text1 = driver.findElement(By.xpath("//a[conatins(text(),'Dilip Buildcon Ltd.')]//ancestor::tr")).getText();
		System.out.println(text1);
		
		// descendant
		List<WebElement> listdes = driver.findElement(By.xpath(""));
		
		// following
		List<WebElement> listfollow = driver.findElement(By.xpath("//a[conatins(text(),'Dilip Buildcon Ltd.')]/following::*"))
				
				
		// preceding
		List<WebElement> listprec = driver.findElement(By.xpath("//a[conatins(text(),'Dilip Buildcon Ltd.')]/preceding::td"))
		
		
		// following siblings
		
		
		// preceding siblings
		
	}

}
