package Methods;

public class MethodsDemo 
{

	// 1) No parameters 				No return value
	
	void m1()
	{
		System.out.println("No parameters 				No return value");
	}
	
	// 2) No parameters				returns value
	
	String m2()
	{
		return "No parameters				returns value";
	}
	
	// 3) Takes parameters 			No return value
	
	void m3(String name)
	{
		System.out.println("Takes parameters 			No return value " + name);
	}
	
	// 4) Takes parameters			returns value
	
	String m4(String name)
	{
		return "Takes parameters			returns value " + name;
	}

}
