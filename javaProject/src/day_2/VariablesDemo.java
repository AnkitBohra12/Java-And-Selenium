package day_2;

public class VariablesDemo {
	
	public static void main (String[] args)
	{
		//int a;       // declaration later we can assign the data to the variable 
		//a=100;		// assigned a data into a // assignment 
		
		int a = 100; // declaration + assignment
		System.out.println(a);
		
		// changing the value of variable 
		a = 200;
		System.out.println(a);
	
		//Appraoch 1 - if we all the variables belongs to different data types
		int b = 100;
		int c = 200;
		int d = 300;
		
		//Approach 2  - if all the variables  belongs to same data type 
		int e, f, g;
		e = 400;
		f = 500;
		g = 600;
		
		// Approach 3 - if all the variables  belongs to same data type 
		int h=700 , i=800, j=900;
		System.out.println("The value of h is :" + h);
		System.out.println("The value of i is :" + i);
		System.out.println("The value of j is :" + j);
		
		System.out.println(h+" "+i+" "+j);
	}
	

}
