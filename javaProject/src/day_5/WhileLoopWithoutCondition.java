package day_5;

public class WhileLoopWithoutCondition {

	public static void main(String[] args) {
		
		int i =1 ;
		
		while(true) {
			System.out.println(i);
			i++;
			
			if(i==10) {
				break;
			}
		}

	}

}
