package Inheritance;

class Insurance{
	double premium() {
		return 10;
	}
}

class TataAig extends Insurance{
	double premium() {
		return 15;
	}
}

class ICICI extends Insurance{
	double premium() {
		return 20;
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		
		Insurance objI = new Insurance();
		System.out.println(objI.premium());
		
		TataAig objT = new TataAig();
		System.out.println(objT.premium());
		
		ICICI objC = new ICICI();
		System.out.println(objC.premium());

	}

}
