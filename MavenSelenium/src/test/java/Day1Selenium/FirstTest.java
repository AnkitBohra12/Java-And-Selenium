package Day1Selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) throws InterruptedException {
		
		// invoking the chrome browser
		WebDriver Driver = new ChromeDriver();
		
		// for getting the page 
		Driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n");
		Driver.manage().window().maximize();
		
		// wait for 10 miliseconds 
		Thread.sleep(10000);
		
		// validate the title
		String GetTitle = Driver.getTitle();
		System.out.println(GetTitle);

		
		String ActualTitle = "OrangeHRM";
		System.out.println(GetTitle.contentEquals(ActualTitle));
		
		// close the page 
		Driver.close();

	}

}
