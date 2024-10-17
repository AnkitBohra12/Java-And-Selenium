package OverloadingVSOverriding;

final class A{
	final int x = 10;
	
	final void AB() {
		System.out.println("This is AB method from class A");
	}
}

// class B extends A{				// Cannot extend as A is final class now
	/*void AB() {					// Cannot override as AB is final method
		System.out.println("This is AB method from class A");
	}*/
//}

public class FInalKeyword {
	public static void main(String[] args) {
		
		A obj = new A();
	//	obj.x = 20;					// Cannot changed as the variable is final
	}
}