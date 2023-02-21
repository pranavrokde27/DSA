package section07_Arrays.lecture_45_63;
import java.util.Arrays;

public class InsertionTwoDimensionalArray {
	int arr[][] = null;
	
	//Constructor
	public InsertionTwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0; row < arr.length; row++) {
			for(int col = 0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertValueIntheArray(int row, int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE) {
				arr[row][col] = value;
				System.out.println("The value is successfully inserted");
			}else {
				System.out.println("This cell is already occupied");
			}			
		}catch (ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index for 2D array");
			
		}
	}
	
	public static void main(String[] args) {
		InsertionTwoDimensionalArray itd = new InsertionTwoDimensionalArray(3,3);
		itd.insertValueIntheArray(0,0, 10);
		itd.insertValueIntheArray(0,1, 20);
		itd.insertValueIntheArray(0,2, 30);
		itd.insertValueIntheArray(1,0, 40);
		itd.insertValueIntheArray(1,1, 50);
		itd.insertValueIntheArray(1,2, 60);
		itd.insertValueIntheArray(2,0, 70);
		itd.insertValueIntheArray(2,1, 80);
		itd.insertValueIntheArray(2,2, 90);
		System.out.println(Arrays.deepToString(itd.arr));
	}
	
}
