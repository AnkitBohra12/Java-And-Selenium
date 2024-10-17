package Day11;

public class Greetings {
	
	// 1) no params 				no return values 
	
	void m1(){
		System.out.println("Hello.....");
	}
	


	// 2) no params 				return values 
	// whenever we return in a value form method we have to store it into a variable 
	
	String m2() {
		return "Hello how are you??";
	}
	
	
	
	// 3) Take params 				no return values 
	
	void m3(String name){
		System.out.println("Hello" + name);
	}
	
	
	
	// 4) Take params 				returns values
	
	String m4(int id) {
		return ("value is " + id);
	}

}

