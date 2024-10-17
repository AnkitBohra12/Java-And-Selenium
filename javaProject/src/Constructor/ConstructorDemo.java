package Constructor;

public class ConstructorDemo {
	
	int a,b;
	
	ConstructorDemo()					// Default constructor
	{									// any constructor without parameter called default constructor
		a=10; b=20;							
	}
	
	ConstructorDemo(int x, int y)		// Parameterized constructor
	{
		a=x; b=y;	
	}
	
	void printData() 
	{
		System.out.println(a+b);
	}
	
	public static void main(String[] args) 
	{
		ConstructorDemo obj = new ConstructorDemo();
		obj.printData();
		
		ConstructorDemo obj1 = new ConstructorDemo(1,2);
		obj1.printData();

	}

}
