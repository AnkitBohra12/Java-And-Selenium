package ConditionalStatement;

import java.util.Scanner;

public class IfElseConditiionDemo {

	public static void main(String[] args) 
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the age : ");
		int age = obj.nextInt();
	
		/*if (age>18)
		{
			System.out.println("Eligible for voting");
		}
		else
		{
			System.out.println("Not Eligible");
		}*/
		
		if (age % 2 == 0)
		{
			System.out.println(age + " Is an even number");
		}
		else 
		{
			System.out.println(age + " Is Odd number");
		}
	}

}
