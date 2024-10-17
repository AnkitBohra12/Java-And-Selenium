package Day12;

public class Adder {

	int a = 10, b=20;
	
	void sum() {					// first method
		System.out.println(a+b);
	}
	
	void sum(int x, int y) {		// number of parameters are different
		System.out.println(x+y);
	}
	
	void sum(int x, double y) {		// datatype of parameters are different
		System.out.println(x+y);
	}
	
	void sum(double x, int y) {		// order of parameters are different
		System.out.println(x+y);
	}
	
	void sum(int a, int b, int c) {	// 
		System.out.println(a+b+c);
	}
}
