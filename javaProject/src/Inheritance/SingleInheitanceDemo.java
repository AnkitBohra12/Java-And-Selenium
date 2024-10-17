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

public class SingleInheitanceDemo {

	public static void main(String[] args) 
	{
		A objA = new A();
		System.out.println(objA.a);
		objA.display();
		System.out.println();
		
		
		B objB = new B();
		System.out.println(objB.b);
		objB.display();
		objB.show();

	}

}
