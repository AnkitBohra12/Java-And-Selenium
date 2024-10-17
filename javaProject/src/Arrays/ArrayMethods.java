package Arrays;

import java.util.Arrays;

public class ArrayMethods {

	public static void main(String[] args) {
		
		int arr[]= {1,52,30,14,5,0};
		
		// sort method
		Arrays.sort(arr);
		
		for(int i:arr) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		// fill method 
		int arr1[]= new int[6];
		Arrays.fill(arr1, 5);
		for(int i:arr1) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// toString method - returns string
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		// copyOf method - copy full array into another array
		
		int copy[]= Arrays.copyOf(arr, arr.length);
		System.out.println(Arrays.toString(copy));
		System.out.println();
		
		// equals - tells two arrays are equal or not 
		// return type is boolean
		int a[]= {8,5,7,3,4,2,8};
		int b[]= {8,5,7,3,4,2,8};
		System.out.println(Arrays.equals(a, b));
		System.out.println();
		
		//binary search method - return index of an array
		
		int no[]= {12,11,14,78,85,45};
		int i = Arrays.binarySearch(no, 14);
		System.out.println(i);
	}
}
