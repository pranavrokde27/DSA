package section07_Arrays.lecture_45_63;

public class SearchingTwoDimensionalArray {
	int arr[][] = null;
	
	public SearchingTwoDimensionalArray(int numberOfRows, int numberOfColumns) {
		this.arr = new int[numberOfRows][numberOfColumns];
		for(int row = 0; row < arr.length;row++){
			for(int col =0; col < arr[0].length; col++) {
				arr[row][col] = Integer.MIN_VALUE;
			}
		}
	}
	
	public void insertValueInTheArray(int row,int col, int value) {
		try {
			if(arr[row][col] == Integer.MIN_VALUE){
				arr[row][col] = value;
			}else{
				System.out.println("end");
			}
	}catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("Invalid index for 2D array");
		}
	}
		
	public void searchingValue(int value) {
		for(int row = 0;row < arr.length;row++) {
			for(int col = 0; col < arr[0].length;col++) {
				if(arr[row][col] == value) {
					System.out.println("Value is found at row: : "+ row +" Col: " + col);
					return;
				}
				
			}
		}
		System.out.println("Value is not found");
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SearchingTwoDimensionalArray s2d = new SearchingTwoDimensionalArray(3, 3);
		s2d.insertValueInTheArray(0, 0, 10);
		s2d.insertValueInTheArray(0,1, 20);
		s2d.insertValueInTheArray(0,2, 30);
		s2d.insertValueInTheArray(1,0, 40);
		s2d.insertValueInTheArray(1,1, 50);
		s2d.insertValueInTheArray(1,2, 60);
		s2d.insertValueInTheArray(2,0, 70);
		s2d.insertValueInTheArray(2,1, 80);
		s2d.insertValueInTheArray(2,2, 90);
		
		s2d.searchingValue(100);
		

	}

}
