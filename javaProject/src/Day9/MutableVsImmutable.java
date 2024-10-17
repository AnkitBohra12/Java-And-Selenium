package Day9;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		
		// mutable - can change
		
		int a[] = {20,3,40,50,60};
		System.out.println(Arrays.toString(a));
		
		Arrays.sort(a); // mutable
		System.out.println(Arrays.toString(a));
		
		
		// immutable - not changeable 
		
		String s = new String("welcome");
		s.concat(" to java.");
		System.out.println(s);		// ----------> immutable

	}

}
