package DataAbstraction;

public class MultipleInheritance extends HybridClass1 implements InterfaceOne, InterfaceTwo{
	
	public void I1() {
		System.out.println(a);		
	}
	
	public void I2() {
		System.out.println(b);
	}

	public static void main(String[] args) {
		
		MultipleInheritance obj = new MultipleInheritance();
		obj.I1();
		obj.I2();
		obj.H1();

	}

}
