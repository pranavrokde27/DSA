package section07_Arrays.lecture_45_63;

import java.util.Arrays;

public class TraversingTwoDimensionalArray {
	int arr[][] = null;
	
	public TraversingTwoDimensionalArray(int numberOfRows, int numberOfColumns){
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
//				System.out.println("The value is successfully inserted");
			}else {
//				System.out.println("This cell is already occupied");
			}
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index for 2D array");
		}
	}
	
	
	public void traverseArray(){
		for(int row = 0; row < arr.length;row++) {
			for(int col = 0; col < arr[0].length;col++) {
				System.out.print(arr[row][col]+ "  ");				
			}System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TraversingTwoDimensionalArray t2d = new TraversingTwoDimensionalArray(2, 3);
		t2d.insertValueInTheArray(0, 0, 10);
		t2d.insertValueInTheArray(0,1, 20);
		t2d.insertValueInTheArray(0,2, 30);
		t2d.insertValueInTheArray(1,0, 40);
		t2d.insertValueInTheArray(1,1, 50);
		t2d.insertValueInTheArray(1,2, 60);
//		t2d.insertValueInTheArray(2,0, 70);
//		t2d.insertValueInTheArray(2,1, 80);
//		t2d.insertValueInTheArray(2,2, 90);
//		
		System.out.println(Arrays.deepToString(t2d.arr));
		
		t2d.traverseArray();
	}

}
