package Day13;

public class StaticMain {

public static void main(String[] args) {
		
		System.out.println(StaticDemo.a);		// we have t0 specify the class name
		StaticDemo.m1();		// if we separate he main class into another class 
		
		StaticDemo sd = new StaticDemo();
		sd.m2();
		System.out.println(sd.b);
		
		sd.m();
	}
}
