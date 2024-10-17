package Arrays;

public class MutliDemionsalArray {

	public static void main(String args[]) {
		
		// Declaration
		
		int arr[][]= new int [3][5];
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		arr[0][4] = 5;
		
		arr[1][0] = 6;
		arr[1][1] = 7;
		arr[1][2] = 8;
		arr[1][3] = 9;
		arr[1][4] = 10;
		
		arr[2][0] = 11;
		arr[2][1] = 12;
		arr[2][2] = 13;
		arr[2][3] = 14;
		arr[2][4] = 15;
		
		int arr1[][]= {{20,21,22,23,24},{25,26,27,28,29},{30,31,32,33,34}};
		
		System.out.println(arr1[1][3]);
		
		for(int r = 0; r<arr1.length; r++) {
			for(int c=0; c<arr1[r].length; c++) {
				System.out.print(arr1[r][c] + " ");
			}
			System.out.println();
		}
		
		// enhanced/ exclusive for loop
		
		System.out.println();
		for(int v[]:arr) {
			for(int var:v){
				System.out.print(var + " ");
			}
		}
		System.out.println();	
	}
}
