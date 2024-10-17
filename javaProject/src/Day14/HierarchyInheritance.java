package Day14;

class Parent{
	void display(int a) {
		System.out.println(a);
	}
}


class Child1 extends Parent{
	void show(int b) {
		System.out.println(b);				// extends from same Parent
	}
}


class Child2 extends Parent{
	void print(int c) {						// extends from same Parent
		System.out.println(c);
	}
}


public class HierarchyInheritance {

	public static void main(String[] args) {
		
		Child1 c1 = new Child1();
		c1.show(100);					// child method	
		c1.display(200);				// parent method
		
		Child2 c2 = new Child2();
		c2.print(300);					// child 
		c2.display(200);				// same parent
		
	}
}
