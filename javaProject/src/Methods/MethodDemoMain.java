package Methods;

public class MethodDemoMain {

	public static void main(String[] args) 
	{
		MethodsDemo obj = new MethodsDemo();
		obj.m1();
		
		String m2_val = obj.m2();
		System.out.println(m2_val);			
		System.out.println(obj.m2());	
		
		obj.m3("John");
		
		
		String m4_val = obj.m4("None");
		System.out.println(m4_val);
		
	}

}
