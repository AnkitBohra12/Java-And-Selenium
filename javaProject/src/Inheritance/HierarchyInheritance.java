package Inheritance;

class parent{
	void display(int a) {
		System.out.println(a);
	}
}

class child1 extends parent{
	void show(int b) {
		System.out.println(b);
	}
}

class child2 extends parent{
	void capture(int c) {
		System.out.println(c);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {
		
		// Object for parent class
		
		parent objP = new parent();
		objP.display(20);
		System.out.println();
		
		// Object for child1 class
		
		child1 objC1 = new child1();
		objC1.show(25);
		objC1.display(20);
		System.out.println();
		
		// Object for child2 class
		
		child2 objC2 = new child2();
		objC2.display(20);
		objC2.capture(30);
		
		
	

	}

}
