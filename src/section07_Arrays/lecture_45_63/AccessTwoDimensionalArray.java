package section07_Arrays.lecture_45_63;

import java.util.Arrays;

public class AccessTwoDimensionalArray {
	int arr[][] = null;
	
	public AccessTwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0;row < arr.length;row++) {
			for(int col = 0;col < arr[0].length;col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertValueInTheArray(int row, int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] =value;
//				System.out.println("The value is successfully inserted");
				
			}else {
//				System.out.println("This cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index for 2D array");
		}
	}
	
	
	public void accessor(int row, int col) {
		System.out.println("\nAccessing row#  "+row+", Col#  " +col);
		try {
			System.out.println("Cell value is: "+arr[row][col]);
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index for 2D array");
		}
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AccessTwoDimensionalArray atd = new AccessTwoDimensionalArray(3, 3);
		atd.insertValueInTheArray(0,0, 10);
		atd.insertValueInTheArray(0,1, 20);
		atd.insertValueInTheArray(0,2, 30);
		atd.insertValueInTheArray(1,0, 40);
		atd.insertValueInTheArray(1,1, 50);
		atd.insertValueInTheArray(1,2, 60);
		atd.insertValueInTheArray(2,0, 70);
		atd.insertValueInTheArray(2,1, 80);
		atd.insertValueInTheArray(2,2, 90);

		System.out.println(Arrays.deepToString(atd.arr));
		
		atd.accessor(1, 1);
	}

}
