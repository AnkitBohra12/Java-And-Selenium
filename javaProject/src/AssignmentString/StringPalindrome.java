package AssignmentString;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		
		// lol is a word 
		
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the palindrome word : ");
		
		String a = obj.next();	
		
		/*for(int i=a.length()-1; i>=0; i-- ) {
			rev = rev + a.charAt(i);
		}*/
		
		StringBuffer n = new StringBuffer(a);
		StringBuffer r = n.reverse();
		String rev = r.toString();

		
		System.out.println(rev);
		
		if(a.equals(rev)) {
			System.out.println("The given word is palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
		

	}

}
