package section07_Arrays.lecture_45_63;

public class SearchForArrayElement {
int arr[] = null;
	
	public SearchForArrayElement(int sizeOfArray) {
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
		
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			SearchForArrayElement sfae = new SearchForArrayElement(10);
			sfae.insert(0, 0);
			sfae.insert(1,10);
			sfae.insert(2, 20);
			sfae.insert(1, 30);
			sfae.insert(9,120);
			
			sfae.searchInArray(40);
			
		}
}
