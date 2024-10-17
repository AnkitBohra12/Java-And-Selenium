package Day12;

public class BoxMain {

	public static void main(String[] args) {
		
		// Box bobj = new Box()					output=0
		//Box bobj = new Box(10.0,10.0,11.2);		output= w*h*l
		Box bobj = new Box(10.5);				// output = len 
		
		
		System.out.println(bobj.volume());
	}

}
