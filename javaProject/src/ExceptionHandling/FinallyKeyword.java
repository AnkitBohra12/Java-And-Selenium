package ExceptionHandling;

public class FinallyKeyword {

	public static void main(String[] args) {
		
		String str = "Hello";
		
//--------------------------- Case 1 ------------------------------- excpetions is already there and handled by handler
		/*try {
			System.out.println(str.length());
		}
		catch(Exception obj) {
			System.out.println(obj.getMessage());
		}
		
		finally {
			System.out.println("You entered into finally block");
		}*/
		
		
//----------------------Case 2 ----------- Different type of expcetion will not handle if we mention it		
		
		/*try {
			System.out.println(str.length());
		}
		catch(ArithmeticException obj) {
			System.out.println(obj.getMessage());
		}
		
		finally {
			System.out.println("You entered into finally block");
		}*/
		
//---------------Case 3 ------------------ Exception does not occurred catch block ignored// that means we have a value in in the variable
		try {
			System.out.println(str.length());
		}
		catch(ArithmeticException obj) {
			System.out.println(obj.getMessage());
		}
		
		finally {
			System.out.println("You entered into finally block");
		}
		
		System.out.println("Program finished");
	}
}
