	package day_6;

public class SingleDimonsationalArray {

	public static void main(String[] args) {
		
		// 1) Declaring array

		// Approach 
		int a[] = new int[5];
		a[0]=100;
		a[1]=200;		// added values into array
		a[2]=300;		// Preferred when we know how many values we have
		a[3]=400;		// otherwise the memory will be wasted 
		a[4]=500;
		
		// Approach 2 this is more dynamic approach cuz we can add value later 
		
		int b[] = {10,20,30,40,50};
		
		
		// find length of an array ---------------
		System.out.println("Length of an array " + a.length);
		
		
		
		// How to read single value from an array
		System.out.println(a[4]);	// can be done by index of value 
		
		
		// reading all the values from array
		
		//normal for loop
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		// for each loop / enhanced for loop
		
		for(int x:b) {
			System.out.println(x);
		}
	}

}
