package ExceptionHandling;

import java.util.Scanner;

public class UncheckedException {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		System.out.println("**************************");
		
		Scanner scan = new Scanner(System.in);
		/*System.out.print("Enter the number : ");
		int i = scan.nextInt();
		
		System.out.println(100/i);*/		// Arithmetic exception
		
//---------------------------------------------------------------------------//		
		
		/*int arr[] = new int[5];
		
		System.out.print("Enter the position : ");
		int pos = scan.nextInt();
		System.out.print("Enter a value : ");
		int val = scan.nextInt();
		
		arr[pos] = val;			// ArrayIndexOutOfBoundsException
		System.out.println(arr[pos]); */
		
// ---------------------------------------------------------------------
		
		/*String str = scan.next();
		int i = Integer.parseInt(str);		// NumberFormatException
		System.out.println(i);*/
	
// ----------------------------------------------------------------------
		
		String str = null;
		System.out.println(str.length());			// NullPointerException


		
		System.out.println("Program Ended");
		System.out.println("*************************");
	}

}
