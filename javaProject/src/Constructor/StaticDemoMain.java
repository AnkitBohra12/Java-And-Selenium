package Constructor;

public class StaticDemoMain 
{

	public static void main(String[] args) 
	{
		// 1) static method can access static stuff directly(without object)
		
		System.out.println(StaticDemo.a);
		StaticDemo.s1();

	}

}
