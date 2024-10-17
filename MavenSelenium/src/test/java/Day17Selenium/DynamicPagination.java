package Day17Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicPagination {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int noOfPages = driver.findElements(By.xpath("//ul[@id='pagination']//a")).size();
		
		int noOfRow = driver.findElements(By.xpath("//table[@id='productTable']//tr")).size();
		
		int noOfCol = driver.findElements(By.xpath("//table[@id='productTable']//tr/th")).size();

		System.out.println("ID"+"\t"+"Name"+"\t"+"Price"+"\t"+"Select");
		
		for(int p=1; p<= noOfPages ; p++) {
			if(p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@id='pagination']//li["+ p +"]"));
				active_page.click();
			}
			
			for(int r=1 ; r<= noOfRow ; r++) {
				for(int c=1 ; c<=noOfCol ; c++) {
					
					String text1 = driver.findElement(By.xpath("//table[@id='productTable']/tbody/tr["+r+"]/td["+c+"]")).getText();
					System.out.print(text1 + "\t");
				}
				
				System.out.println();
			}
		}
	}
}
