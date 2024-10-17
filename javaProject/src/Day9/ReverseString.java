package Day9;

public class ReverseString {

	public static void main(String[] args) {
		
		// method 1 
		
		String s = "Welcome";
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		System.out.println();
		
		
		// method 2 by string buffer
		
		StringBuffer s1 = new StringBuffer("Welcome");
		StringBuffer rev1 = s1.reverse();
		System.out.println(rev1);
		System.out.println();

		// method 3 by string builder
		
		StringBuilder s2 = new StringBuilder("welcome");
		StringBuilder rev2 = s2.reverse();
		System.out.println(rev2);
		System.out.println();
		
		//////////////// method 4 - without using any string method /////////////////////
		
		String a = "welcome";
		String re = "";
		
		char b[] = s.toCharArray(); 	// conversion convert string into array char
		
		for(int i=b.length-1; i>=0; i--) {		// here length is not a method it will give length of an array 
			re = re + b[i];
		}
		System.out.println(re);
	}
}
