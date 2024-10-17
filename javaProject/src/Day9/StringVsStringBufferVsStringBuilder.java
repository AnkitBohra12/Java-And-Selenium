package Day9;

public class StringVsStringBufferVsStringBuilder {

	public static void main(String[] args) {
		
		// String - immutable 
		
		String s = "welcome";
		s.concat(" to java.");
		System.out.println(s);
		
		
		// String Buffer - mutable 
		
		StringBuffer sb = new StringBuffer("welcome");
		sb.append(" to java.");
		System.out.println(sb);
		
		// String Builder - mutable
		
		StringBuilder sbb = new StringBuilder("welcome");
		sbb.append(" TO JAVA.");
		System.out.println(sbb);
		
		
		System.out.println("welcome" + " to haava");

	}

}
