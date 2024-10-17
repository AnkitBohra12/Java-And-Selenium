package Day7;

public class SearchingElementInArray {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		
		int searchElement = 70;
		
		boolean status = false;
		
		for(int i=0; i<a.length; i++) {
			if(a[i] == searchElement) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		
		
		// enchanced for loop
		
		for(int x:a) {
			if(x == searchElement) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}
		
		
		
		if(status == false) {
		System.out.println("Element not found");
		}
	} 

}
