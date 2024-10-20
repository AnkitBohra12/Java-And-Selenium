package Day12Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragNDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Actions act = new Actions(driver);
		WebElement washington = driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement UnitedStates = driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washington, UnitedStates).perform();
		
		for(int i=1; i<8 ;i++) {
			WebElement source = driver.findElement(By.xpath("//div[@id='box " +i+ "']"));
			WebElement target = driver.findElement(By.xpath("//div[@id='box10 " +i+ "']"));
			
			act.dragAndDrop(source, target).perform();		
			}
	}

}
