package section07_Arrays.lecture_45_63;

public class SingleDimensionArray {

	int arr[] = null;
	
	public SingleDimensionArray(int sizeOfArray) {
		arr = new int[sizeOfArray];
		for(int i =0; i< arr.length; i++) {
			arr[i] = Integer.MIN_VALUE;
		}
	}
	public void insert(int location, int valueToBeInserted) {
		try {
			if(arr[location] == Integer.MIN_VALUE) {
				arr[location] = valueToBeInserted;
				System.out.println("Succcessfully inserted");
			}else {
				System.out.println("This cell is already occupied");
			}
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Invalid index to access array");
		}
		
	}
}
