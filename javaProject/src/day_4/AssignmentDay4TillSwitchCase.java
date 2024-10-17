package day_4;
import java.util.Scanner;

public class AssignmentDay4TillSwitchCase {

	public static void main(String[] args) 
	
	{
		/*Scanner obj = new Scanner(System.in);
		System.out.println("Enter the numbers to find the smallest b/w three numbers : ");
		
		// 1) find out smallest of the three numbers
			
		int a = obj.nextInt(), b = obj.nextInt(), c = obj.nextInt();
		
		/*if (a<b && a<c)
			System.out.println(a+ " is the smallest number");
		
		else if (b<a && b<c)
			System.out.println(b+ " is the smallest number");
		
		else
			System.out.println(c+ " is the smallest number");*/
		
		//					exp		? result 1 : result 2
		/*int x = c < (a<b  ? a : b) ? c :(a<b  ? a : b) ;
		System.out.println(x);*/
		
		
		
		
		// 2) print number on the base of names(week)

		/*Scanner wk = new Scanner(System.in);
		System.out.println("Enter the week name : ");
		
		String week_Name = wk.next();
		
		switch (week_Name)
		{
			case "Sunday" : System.out.println(1); break;
			case "Monday" : System.out.println(2); break;
			case "Tuesday" : System.out.println(3); break;
			case "Wednesday" : System.out.println(4); break;
			case "Thusday" : System.out.println(5); break;
			case "Friday" : System.out.println(6); break;
			case "Saturday" : System.out.println(7); break;
		}*/
		
		// 3) Military admission- age>18, weight>50, height>5.10
		
		Scanner mil = new Scanner(System.in);
		System.out.println("Enter the age, weight and height of the candidate : ");
		
		
		int age = mil.nextInt(), weight = mil.nextInt();
		float height = mil.nextFloat();
		
		if (age>18 && weight>50 && height>5.10) 
			System.out.println("Cleared the medical exam");
		else
			System.out.println("Rejected");

	}

}
