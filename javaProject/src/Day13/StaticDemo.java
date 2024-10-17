package Day13;

public class StaticDemo {
	
	static int a = 10;
	int b = 20;
	
	static void m1() {
		System.out.println("This is m1 a static method");
	}
	
	void m2() {
		System.out.println("This is m2 a non-static method");
	}

	void m() {
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	
	/*public static void main(String[] args) {
		
		System.out.println(a);
		m1();
		
		StaticDemo sd = new StaticDemo();
		sd.m2();
		System.out.println(sd.b);
		
		sd.m();
	}*/

}
