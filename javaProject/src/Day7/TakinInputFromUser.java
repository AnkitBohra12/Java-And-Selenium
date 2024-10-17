package Day7;

import java.util.Scanner;

public class TakinInputFromUser {

	public static void main(String[] args) {
		
		// int num = 20; // hard coded value 
		
		// Scanner calls for acting  value from the console 
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = sc.nextInt();
		System.out.println(num);
		
		
		// how to take string
		
		System.out.println("Enter the city : ");
		String city = sc.next();
		System.out.println(city);

	}

}
