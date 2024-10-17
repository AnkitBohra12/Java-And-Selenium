	package AssignmentDay5;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) 
	{
		//   palindrome number (conditional state + looping)
		//	input 121
		//	after reversing 121
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the palindrome number : ");
		
		int a = obj.nextInt();
		
		int org_a = a;
		
		int rev = 0;
		
		while(a!=0) {
			rev = rev*10 + a%10;		// 0*10 + 1234%10 = 4 // 4*10 + 123%10 = 40+3= 43 // 43*10 + 12%10 = 430+2 = 432 // 432*10 + 1%10 = 4320+1 = 4321
			a = a/10;						// 1234/10 = 123	// 123/10 = 12		// 12/10 = 1 	// 1/10 = 0
		}
		
		
		if (a==rev) {
			System.out.println("Is a palindrome number");	
		}
		else {
			System.out.println("Not a palindrome");
		}


	}

}
;