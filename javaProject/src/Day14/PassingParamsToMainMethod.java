package Day14;

public class PassingParamsToMainMethod {

	public static void main(String[] args) {
		
		System.out.println(args.length);
		
//		System.out.println("Testing.....");
		
		for(String value:args) {
			System.out.println(value);
		}
	}
}
