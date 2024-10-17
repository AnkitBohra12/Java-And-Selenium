package day_6;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		// declaring array
		
		// Approach 1		// [][]a // []a[] // a[][] all are same
		int a[][] = new int[3][2];	// no of rows/columns
		
		a[0][0] = 100;
		a[0][1] = 200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600;
		
		
		// Approach 2
		int b[][]= { {100,200},
				     {300,400},
				     {500,600} 
				     };
		
		// find length of an array
		System.out.println("length of rows : " + a.length);
		System.out.println("Length of columns : " + a[0].length);
		
		// how to read single value from an array
		System.out.println(a[2][1]);
		
		// read all the rows and columns
		
		// normal for
		for(int r=0; r<a.length ;r++) {
			for (int c=0; c<a[r].length ; c++) {
				System.out.print(a[r][c]+ " ");
			}
			System.out.println();
		}
		System.out.println();
		
		// enhanced for loop
		
		for(int arr[]:b) {
			for(int x:arr) {
				System.out.print(x + " ");
			}
			System.out.println();
		}	

	}

}
