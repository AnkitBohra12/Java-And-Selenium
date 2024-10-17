package Day9Selenium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		driver.get("https://turorialsninja.com/demo/");
		
//		driver.navigate().to("https://turorialsninja.com/demo/");
//		
//		URL myurl = new URL("https://turorialsninja.com/demo/");
//		driver.navigate().to(myurl);
		
		driver.navigate().to("https://turorialsninja.com/demo/");
		driver.navigate().to("https://google.com/");
		Thread.sleep(3000);
		System.out.println(driver.getCurrentUrl());
		Thread.sleep(3000);
		
		
		
		
	}

}
