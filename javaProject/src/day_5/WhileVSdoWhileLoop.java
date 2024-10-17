package day_5;

public class WhileVSdoWhileLoop {

	public static void main(String[] args) {
		
		int i =1;				// if the condition is false it will not give any output
		
		while(i<=5) {
			System.out.println(i);
			i++;
		}

		// Do-while loop
		
		int a=1;			// it will print first and then check the condition/ so first statement will executed 
		do {
			System.out.println(a);
			a++;
		}while(a<=5);
		
	}

}
