package OverloadingVSOverriding;

class A {
	void m1(int a) {
		System.out.println(a);
	}
	
	void m2(int b) {
		System.out.println(b);
	}
}

class B extends A{
	void m1(int a) {				//	Overriding
		System.out.println(a+a);
	}
	
	void m2(int a,int b) {			// Overloading
		System.out.println(a*b);
	}
}

public class OverloadingVSOverriding {

	public static void main(String[] args) {
		A objA = new A();
		objA.m1(20);
		objA.m2(25);
		
		B objB = new B();
		objB.m1(5);
		objB.m2(10);
		objB.m2(8, 8);
	}

}
