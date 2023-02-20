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
			if(arr[location] == Integer.MIN_VALUE) { //------------------O(1)
				arr[location] = valueToBeInserted;   //------------------O(1)
				System.out.println("Succcessfully inserted"); //------------------O(1)
			}else {
				System.out.println("This cell is already occupied"); //------------------O(1)
			}
			
		}catch(ArrayIndexOutOfBoundsException e){ //------------------O(1)
			System.out.println("Invalid index to access array"); //------------------O(1) hence time complexity:- O(1)
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDimensionArray sd = new SingleDimensionArray(10);
		sd.insert(0, 0);
		sd.insert(1,10);
		sd.insert(2, 20);
		sd.insert(1, 30);
		sd.insert(9,120);
	}
}
