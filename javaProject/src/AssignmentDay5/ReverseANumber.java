package AssignmentDay5;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) 
	{
		// 1) reverse a number ( % / = operators) along with the looping statements
		// 		input 1234
		// 		output 4321
		
		Scanner obj = new Scanner(System.in);								// for capturing we use % operator 
		System.out.print("Enter the number you want to reverse : ");		// for removing a number we use / operator
		int a = obj.nextInt(); // 1234 		4321
		
		// 1) using algorithm
		
		/*int rev = 0;
		
		while(a!=0) {
			rev=rev*10 + a%10;		// 0*10 + 1234%10 = 4 // 4*10 + 123%10 = 40+3= 43 // 43*10 + 12%10 = 430+2 = 432 // 432*10 + 1%10 = 4320+1 = 4321
			a = a/10;				// 1234/10 = 123	// 123/10 = 12		// 12/10 = 1 	// 1/10 = 0
		} */
		
		
		// 2) using StringBuffer class method
		
		
		StringBuffer sb = new StringBuffer(String.valueOf(a));		// this will convert the int value into string format
		
		StringBuffer rev = sb.reverse();			// this method will reverse the string 
		
		System.out.println("Reverse number with StringBuffer method : " + rev);				
		
		
		
		// 3) Using StringBuilder class 
	
		StringBuilder sbl = new StringBuilder();
		
		sbl.append(a);			// this will append the value of a into sbl which contains our number
		
		StringBuilder rev1 = sbl.reverse();	
		
		System.out.println("Reversing a number using stringBuilder method : " + rev1);

	}

}
