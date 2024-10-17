package Strings;

import java.util.Arrays;

public class StringMethods {

	public static void main(String args[]) {
		
		// Declaration
		
		/*String s = "Welcome";
		
		String w = new String("Value");
		
		System.out.println(s);
		System.out.println(w);*/
		
		// Length method : It will return no. of char in a string
		
		String name = "Ankit";
		
		int L = name.length();
		System.out.println(L);
		
		System.out.println(name.length());
		
		System.out.println("Ankit".length());
		System.out.println();
		
		
		// Concat : used for joining the string
		
		String S1 = "join";
		String S2 = " here";
		String S3 = " end";
		
		System.out.println(S1 + S2);
		
		System.out.println(S1.concat(S2));
		
		System.out.println(S1 + S2 + S3);
		
		System.out.println(S1.concat(S2).concat(S3));
		
		System.out.println(S1.concat(S2+S3));
		
		
		// Trim : used to remove spaces from right and left side of a String
		
		String St = "         Remove the spaces      ";
		
		System.out.println(St);
		
		System.out.println("Before triming : " + St.length());
		
		System.out.println(St.trim());
		
		System.out.println("After triming : " + St.trim().length());
		System.out.println();
		
		
		// CharAt : returns the char , string based on index ( index starts from 0 )
		
		St = " String based ";
		
		System.out.println(St.charAt(4));
		//System.out.println(St.charAt(7));
		//System.out.println(St.charAt(0));
		System.out.println();
		
		// contains()   returns boolean
		
		St = "given values is 1000"; 
		
		System.out.println(St.contains("values")); 
		System.out.println(St.contains("1000"));
		System.out.println(St.contains("les")); 	// false cuz the string is not continuous
		System.out.println();
		
		// Equals(); equalsIgnoreCase()	 returns boolean
		
		St = "Its";
		String St1 = "Its";
		System.out.println(St==St1);
		System.out.println(St.equals(St1));
		System.out.println(St.equals("Itss"));
		System.out.println(St.equalsIgnoreCase("its"));
		System.out.println();
		
		// replace();		replace single or multiple sequence of characters in a String
		// returns string
		
		St = "This is automation batch with selenium and java";
		System.out.println(St.replace('a','b'));
		System.out.println(St.replace("selenium","cypress"));
		System.out.println();
		
		//subString() 			extract subString from main String
		// starting index 0 
		// ending index 1
		
		St = "playwright";
		System.out.println(St.substring(1,4));
		System.out.println(St.substring(4,10));
		System.out.println(St.substring(3,6));
		System.out.println();
		
		
		// toUpperCase();   toLowerCase();
		
		St = "weLcome";
		System.out.println(St.toUpperCase());
		System.out.println(St.toLowerCase());
		System.out.println("My cItY Is nOIda".toUpperCase());
		System.out.println();
		
		// split method : split the string in multiple parts based on 
		
		St = "pqr@xyz.com";
		String s[]=St.split("@");
		System.out.println(Arrays.toString(s));
		System.out.println(s[1]);
		
		String s1[]=s[1].split(".");
		System.out.println(Arrays.toString(s1));
		
		//example 2 
		String a = "123,pqr#xyz@abc";
		a = a.replace("#", ",").replace("@", ",");
		String b[]= a.split(",");
		System.out.println(Arrays.toString(b));
		
		// * % ^ & ( ) cannot tale as delimiter
		
		// example 3
		String ex = "John Kanade";
		System.out.println(ex.contains("john"));	// false
		
		
		
	}
}
