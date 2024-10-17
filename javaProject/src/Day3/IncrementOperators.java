package Day3;

public class IncrementOperators {

	public static void main(String[] args) 
	{
		// ++ is called as a increment operator
		
		//case 1
		int a=10;
		System.out.println(a);
		a++;					//a=a+1; a+=1;
		System.out.println(a);
		
		//case 2	
		//post increment --> first assignment will happen then increment will happen
		int b=10;
		int result=b++;
		System.out.println(result);		//10
		System.out.println(b);
		
		//Case 3
		//pre increment ---> first increment will happen after that assignment will happen
		int c = 10;
		int res = ++c;	
		System.out.println(res);		//11
		
	
	}

}
