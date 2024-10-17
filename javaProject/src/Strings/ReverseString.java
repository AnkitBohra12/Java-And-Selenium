package Strings;

public class ReverseString {

	public static void main(String[] args) {
		
		String name = "john";
		String rev = "";
		
		/*for(int i = name.length()-1; i>=0 ;i--) {
			rev = rev + name.charAt(i);
		}
		System.out.println(rev);*/
		
		// way 2  - using CharArray()
		
		char ch[] = name.toCharArray();
		for(int i=name.length()-1; i>=0; i--) {
			rev = rev + ch[i];
		}
		System.out.println(rev);
	}
}
