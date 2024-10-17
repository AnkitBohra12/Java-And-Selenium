package Day16Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();

//		single file upload
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\bohra\\Downloads\\KeyOfGit.png");
		
		String fileText = driver.findElement(By.xpath("//ul[@id='fileList']/li")).getText();
		
		if(fileText.equals("KeyOfGit.png")) {
			System.out.println("File upload successfully");
		}
		else {
			System.out.println("File not uploaded");
		}
		
		
//		multiple file upload
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\bohra\\Downloads\\KeyOfGit.png");
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\bohra\\Downloads\\after qutting.png");
		
//		another way
		String filePath1 = "C:\\Users\\bohra\\Downloads\\KeyOfGit.png";
		String filePath2 = "C:\\Users\\bohra\\Downloads\\after qutting.png";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(filePath1 + "\n" + filePath2);
		
		
//		validating number of elements uploaded
		int noOfFileUploaded = driver.findElements(By.xpath("//ul[@id='fileList']/li")).size();
		
		if (noOfFileUploaded==2) {
			System.out.println("All file are uploaded");
		}
		else {
			System.out.println("File are not uploaded OR incorrect file uploaded");
		}
		
//		validating through text 
		if (driver.findElement(By.xpath("//ul[@id='fileList']/li[1]")).getText().equals("KeyOfGit.png") && driver.findElement(By.xpath("//ul[@id='fileList']/li[2]")).getText().equals("after qutting.png")) {
			System.out.println("Files are uploaded successfully");
		}
		else {
			System.out.println("Files are not uploaded OR Error in file upload");
		}
	}
}
