package Day8;

import java.util.Arrays;

public class StringMethod {

	public static void main(String[] args) {
		
		String s = "welcome";
		//String s = new String("welcome");
		System.out.println(s);
		
		// length() - returns length of a string(no of char)
		
		String s1 = "welcome";
		System.out.println(s1.length());
		System.out.println("ank".length());
		
		// concat() - joining strings
		String s2 = "welcome";
		String s3 = "to java";
		s1 = "automation";
		System.out.println(s2+s3+s1);
		System.out.println(s2.concat(s3).concat(s1));
		System.out.println("welcome".concat("to java"));
		
		// trim() - remove spaces right  and left side
		
		s = "    welcome    ";
		System.out.println(s.length());
		System.out.println(s.trim());
		
		// charAt() - returns a char from a string based on index
		
		s = "welcome";
		
		System.out.println(s.charAt(2));
		System.out.println(s.charAt(0));
		
		// contains() - returns true/false
		System.out.println(s.contains("wel"));
		System.out.println(s.concat("come"));
		System.out.println(s.concat("Wel"));
		
		// equals() , equalsIgnoreCase() - compare strings
		s1 = "welcome";
		s2 = "welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.contentEquals("Welcome"));	// false
		System.out.println();
		
		// replace() - replace  single/ multiple (sequence) of char in a string
		
		s = "welcome to selenium java selenium python selenium c#";
		
		System.out.println(s.replace("to","the"));
		System.out.println(s.replace('s', 'x'));
		
		// substring() - extract substring from the main string
		
		s = "welcome";
		System.out.println(s.substring(1,5));
		
		
		// split() - split the string into multiple parts based on delimiter
		// extract dynamically 
		s = "abc@gmail.com";
		String []a = s.split("@");
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		//ex1 
		String amount = "$12,20,55";		//expected output : 122055
		
		System.out.println(amount.replace("$","").replace(",",""));
		
		//ex2
		s = "abc,123@xyz";
		
		String arr[]= s.split(",");
		System.out.println(Arrays.toString(arr));
		
		String ary[] = arr[1].split("@");
		System.out.println(Arrays.toString(ary));
		
		System.out.print(arr[0]);
		System.out.print(ary[0]);
		System.out.print(ary[1]);
		
		
	}

}
