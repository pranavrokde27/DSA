package section07_Arrays.lecture_45_63;

public class DeletingArrayElement {

int arr[] = null;
	
	public DeletingArrayElement(int sizeOfArray) {
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
			System.out.println("Invalid index to access array"); //------------------O(1) 
			
		}
	}
	
	//Array traversal
	
	public void traverseArray(){
		try {
		for(int i = 0; i < arr.length;i++) {  //------------------O(N)
			System.out.print(arr[i] + " ");  //------------------O(1)
				}
			}catch(Exception e) {
				System.out.println("Array index out of bound");   //------------------O(1)Hence Time Complexity=O(N)
			}
		}														  //Space Complexity=O(1)
	
	
		public void searchInArray(int valuetosearch) {
			for(int i = 0;i <arr.length;i++) {
				if(arr[i] == valuetosearch) {
					System.out.println("value is found at the index of " + " "+ i);
					return;
				}
			}
			System.out.println(valuetosearch + " is not found");
		}
		
		public void deleteValue(int valueToDelete) {
				try {
					arr[valueToDelete]=Integer.MIN_VALUE;  //-------------->O(1)
					System.out.println(valueToDelete +" The value has been deleted successfully");  //-------------->O(1)
			}catch (ArrayIndexOutOfBoundsException e){
				System.out.println("The value taht is provided is not in the range of array");
			}
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			DeletingArrayElement dae = new DeletingArrayElement(10);
			dae.insert(0, 0);
			dae.insert(1,10);
			dae.insert(2, 20);
			dae.insert(1, 30);
			dae.insert(9,120);
			
//			dae.searchInArray(40);
			dae.deleteValue(0);
			
			System.out.println(dae.arr[0]);
			
		}

}
