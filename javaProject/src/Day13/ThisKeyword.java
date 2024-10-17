package Day13;

public class ThisKeyword {
	
	int x,y;  				// class variables and instance variables
	
	ThisKeyword(int x, int y){		// local variables			// constructor
		this.x=x;					// this representing the class 
		this.y=y;
	}
	
	void display() {
		System.out.println(x);
		System.out.println(y);
	}

	public static void main(String[] args) {
		
		ThisKeyword th = new ThisKeyword(100,200);
		th.display();

	}

}
