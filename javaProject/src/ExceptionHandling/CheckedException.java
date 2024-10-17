package ExceptionHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException, FileNotFoundException {
		
		System.out.println("Program Started");
		System.out.println("*****************************");
		
		// case 1 - by try  catch block
		try {
			Thread.sleep(3243);
		} 
		catch(InterruptedException e){
			
		}
		
		
		// case 2- by using throws name of exception
		Thread.sleep(5000);
		
		FileInputStream input = new FileInputStream("C:\\Test.txt");
		
		System.out.println("Program Ended");
		System.out.println("*****************************");
		
	}

}
