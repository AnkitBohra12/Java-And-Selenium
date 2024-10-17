package TypeCasting;

import java.util.Scanner;

public class ScannerClassDemo {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the values of variable : ");
		int a = obj.nextInt();
		float b = obj.nextFloat();
		String s = obj.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(s);
		

	}

}
