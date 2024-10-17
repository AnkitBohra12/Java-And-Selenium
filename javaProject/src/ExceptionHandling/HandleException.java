package ExceptionHandling;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		
		System.out.println("Program Started");
		System.out.println("**************************");
		
		Scanner scan = new Scanner(System.in);
		
//---------First exception ---------------------------
		
		/*System.out.print("Enter the number : ");
		int i = scan.nextInt();
		
		try {
			System.out.println(100/i);		// ArithemeticExcpetion
		}
		catch(ArithmeticException obj) {
			System.out.println("Zero not allowed");
			System.out.println(obj.getMessage());
		}*/
		
//----------------------- Second exception--------------------------
		/*int arr[] = new int[5];
		
		System.out.print("Enter the position : ");
		int pos = scan.nextInt();
		System.out.print("Enter a value : ");
		int val = scan.nextInt();
		try {
			arr[pos] = val;			// ArrayIndexOutOfBoundsException
			System.out.println(arr[pos]);
		}
		catch(ArrayIndexOutOfBoundsException obj1) {
			System.out.println(obj1.getMessage());
		}*/
		
//--------------- Third Exception ---------------------------------
		// By using multiple catch block
		
		/*String str = scan.next();
		
		try {
			int i = Integer.parseInt(str);		// NumberFormatException
			System.out.println(i);
		}
		catch(ArrayIndexOutOfBoundsException obj1) {
			System.out.println(obj1.getMessage());
		}
		catch(NumberFormatException obj1) {
			System.out.println(obj1.getMessage());
		}
		catch(ArithmeticException obj1) {
			System.out.println(obj1.getMessage());
		}*/
		
//---------------- Forth Exception--------------------------------
		
		String str = null;
		try {
			System.out.println(str.length());
		}
		catch(Exception obj) {
			System.out.println(obj.getMessage());
		}
		
		System.out.println("Program Ended");
		System.out.println("*************************");

	}
}
