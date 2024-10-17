package Day7;

import java.util.Arrays;

public class SortingStrings {

	public static void main(String[] args) {
		char c[] = {'A','C','B','A'};
		String s[] = {"scott", "marry", "john", "david"};
		
		System.out.println("before starting...." + Arrays.toString(s));
		Arrays.sort(s);
		System.out.println("After sorting....." + Arrays.toString(s));
	}

}
