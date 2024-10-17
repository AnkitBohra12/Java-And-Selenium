package day_6;

public class PrimeNumberInArray {

	public static void main(String[] args) {
		
		
		int a[] = {1,2,3,4,5};
		
		int count = 0;
		
		for(int i=0; i<a.length ;i++) {
			for(int j=0; j<a.length; j++) {
				for(int k=1; k<=a[j] ; k++) {
					if(a[j]%k==0) {
						count++;					}
				}
				if(count==2) {
					System.out.println(a[j]);
					count=0;
				}
		}
		
		
		}
	}
}