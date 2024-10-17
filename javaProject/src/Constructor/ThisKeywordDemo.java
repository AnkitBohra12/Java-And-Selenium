package Constructor;

public class ThisKeywordDemo 
{
	int a,b;				// class variable/ instance variable
	
	/*ThisKeywordDemo(int a,int b)		// Constructor
	{
		this.a = a;
		this.b = b;
	}*/
	
	void setData(int a, int b) 
	{
		this.a = a;
		this.b = b;
	}
	
	void display() {
		System.out.println(a + "     " + b);
	}
	
	public static void main(String[] args) 
	{
		//ThisKeywordDemo obj = new ThisKeywordDemo(10,29);
		
		ThisKeywordDemo obj = new ThisKeywordDemo();
		
		obj.setData(10,29);
		obj.display();
		
	}

}
