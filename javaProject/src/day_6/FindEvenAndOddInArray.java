package day_6;

public class FindEvenAndOddInArray {

	public static void main(String[] args) {
		
		// Count even or odd no. for array
		
		int a[] = {1,2,3,4,5,};
		int even = 0, odd = 0;
		
		
		for (int i=0; i<a.length ; i++ ) {				 
			if(a[i]%2==0) {
				even++;			
			}
			else {
				odd++;
			}	
		}
		System.out.println("Even : " + even);
		System.out.println("Odd : " + odd);
	
	// Separate the even and odd numbers
		
		int b[] = {1,2,3,4,5,};
		int e = 0, o = 0 ;
		
		for (int i=0; i<a.length ; i++ ) {				 
			if(a[i]%2==0) {
				e = a[i];
				System.out.println("this is even :" + e);		
				System.out.println();
			}
			else {
				o = a[i];
				System.out.println("This is odd " + o);
			}
		}
		
	}
}