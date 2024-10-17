package day_6;

public class AssignmentOfDay6Arrays {

	public static void main(String[] args) {
		
		// 1) Add the elements in a arrray 
		
		int a[] = {1,2,3,4,5};
		int sum = 0;
		
		/*for(int i=0 ; i<a.length ; i++ ) {
			
			sum = sum + a[i];	
		}
		System.out.println(sum);*/
		
		for (int i:a) {
			sum+=i;
			
		}
		
		System.out.println(sum);
	} 	

}
