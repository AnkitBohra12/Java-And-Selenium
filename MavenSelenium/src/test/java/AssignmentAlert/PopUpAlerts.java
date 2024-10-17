package AssignmentAlert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//Click for JS Alert
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();

		// Switching to alert
		Alert jsalert = driver.switchTo().alert();

		// Accept the alert
		jsalert.accept();
		
		// Capturing the result 
		String resultText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(resultText);

		// Comparing alert text with expected 
		String expectedAlertText = "You successfully clicked an alert";
		System.out.println(resultText.equals(expectedAlertText));
		
		System.out.println();
		
//*****************************************************************************************************************//		
		
		// Click for JS confirm
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		
		// Accept the alert
		jsalert.accept();
		
		// capturing the text
		String resText = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(resText);
		
		// Comparing the text and expected
		String expectedText = "You clicked: Ok";
		System.out.println(resText.equals(expectedText));
		
		System.out.println();
		
		
//********************************************************************************************************************//
		
		// Click for JS Prompt
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		jsalert.sendKeys("This is an alert");
		
		// Accept the alert
		jsalert.accept();
		
		// capturing and printing the text
		String text = driver.findElement(By.xpath("//p[@id='result']")).getText();
		System.out.println(text);
		
		// comparing both the expected and result
		String expected = "You entered: This is an alert";
		System.out.println(text.equals(expected));
		
		
		
		
		
		
	}

}
