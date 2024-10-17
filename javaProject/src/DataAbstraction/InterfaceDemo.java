package DataAbstraction;

interface test{
	int length = 100;			// Final and static variable after declaring it under interface
	int width = 100;			// Final and static see the italic font 
	
	void circle();				// Abstract method
	
	default void square() {
		System.out.println("This is square default method");
	}
	
	static void rectangle() {
		System.out.println("This is rectangle static method");
	}
}

public class InterfaceDemo implements test {
	
	public void circle() {
		System.out.println("This is circle abstract method");
	}
	
	void triangle() {
		System.out.println("This is triangle");
	}
	
	int x = 10;
	int y = 20;
	
	public static void main(String[] args) {
		
		InterfaceDemo obj = new InterfaceDemo();
		obj.circle();
		obj.square();
		obj.triangle();
		
		test.rectangle();    		// we can call by class name any static method
		
		test objT = new InterfaceDemo();
		objT.circle();
		objT.square();
	
		test.rectangle();
		
		System.out.println(test.length);		// static variables can be called with interface name 
		System.out.println(test.width);
		
		System.out.println(obj.x);
		System.out.println(obj.y);
	}

}
