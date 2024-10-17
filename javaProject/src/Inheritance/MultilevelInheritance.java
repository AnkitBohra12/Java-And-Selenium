package Inheritance;
	
	class A								// Parent class 
	{	
		int  a = 5;				
		void display()
		{
			System.out.println(a);
		}
	}

	class B extends A					// Child class
	{
		int b = 10;
		void show() 
		{
			System.out.println(b);
		}
	}
	
	class C extends B
	{
		int c = 15;
		void capture() 
		{
			System.out.println(c);
		}
	}

	public class MultilevelInheritance {
	
	public static void main(String[] args) 
	{
		// Object for class A
		
		A objA = new A();
		System.out.println(objA.a);
		objA.display();
		System.out.println();
		
		// Object for class B
		
		B objB = new B();
		System.out.println(objB.a);
		System.out.println(objB.b);
		objB.display();
		objB.show();
		System.out.println();
		
		// object for class C
		
		C objC = new C();
		System.out.println(objC.a);
		System.out.println(objC.b);
		System.out.println(objC.c);
		objC.display();
		objC.show();
		objC.capture();
		
	}

}
