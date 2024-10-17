package Day9;

public class StringComparison {

	public static void main(String[] args) {
		
		// Scenario 1
		
		String s2 = "welcome";
		String s1 = "welcome";
		// if you are creating string variable directly there is not difference in both the comparison
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println();
		
		
		// Scenario 2 
		
		String s = new String("welcome");
		String a = new String("welcome");
		
		// when we declare the string by new (obj) 
		System.out.println(s==a);		// false   // we used to compare the objects 
		System.out.println(s.equals(a));		// true		// to compare values of objects 
		System.out.println();
		
		
		// Scenario 3
		
		String b = "welcome";
		String c = new String("welcome");
		
		System.out.println(b==c);
		System.out.println(b.equals(c));
		System.out.println();
		
		
		// Scenario 4

		String e = "welcome";
		String f = new String("welcome");
		String g = f;
		
		System.out.println(e==f);
		System.out.println(e.equals(f));
		System.out.println(f==g);		// true cuz objects are same
	}

}
