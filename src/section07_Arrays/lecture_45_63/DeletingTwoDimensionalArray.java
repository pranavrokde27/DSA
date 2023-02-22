package section07_Arrays.lecture_45_63;


import java.util.Arrays;

public class DeletingTwoDimensionalArray {
	int arr[][] = null;
	
	public DeletingTwoDimensionalArray(int numberOfRows, int numberOfColumns){
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0;row < arr.length;row++) {
			for(int col = 0; col < arr[0].length;col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
		
	}
	
	public void insertValueInTheArray(int row,int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("The value "+value + " is successfully inserted");
			}else {
//				System.out.println("This cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index for 2D array");
		}
	}
	
	
	public void deleteArray(int row, int col) {
		try {
			System.out.println("Succesfully deleted "+ row + " & " + col +  ": "+arr[row][col]);
			arr[row][col] =Integer.MIN_VALUE;
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("The value is out of index");
		}
	}
	
	
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeletingTwoDimensionalArray d2a = new DeletingTwoDimensionalArray(3, 3);
		d2a.insertValueInTheArray(0,0, 10);  d2a.insertValueInTheArray(0,1, 20); d2a.insertValueInTheArray(0,2, 30);
		d2a.insertValueInTheArray(1,0, 40);  d2a.insertValueInTheArray(1,1, 50); d2a.insertValueInTheArray(1,2, 60);
		d2a.insertValueInTheArray(2,0, 70);  d2a.insertValueInTheArray(2,1, 80); d2a.insertValueInTheArray(2,2, 90);
	
		System.out.println(Arrays.deepToString(d2a.arr));
		
		d2a.deleteArray(0,1);
		
		System.out.println(Arrays.deepToString(d2a.arr));
	}

}
