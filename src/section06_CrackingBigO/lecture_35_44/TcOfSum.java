package section06_CrackingBigO.lecture_35_44;

//Create a function which calculates the sum and product of elements of array.
//Find the time complexity for created method.

public class TcOfSum {
	
	void spofArray(int[] array) {
		int sum = 0;  //O(1)
		int product = 1;//O(1)
		for(int i = 0; i < array.length;i++) {  //O(N)
			sum += array[i];   //O(1)
		}
		for (int i=0; i<array.length; i++) {  //O(N)
			product *= array[i];   //O(1)
		}
		System.out.println(sum + ","+product); ///O(1)
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TcOfSum main =new TcOfSum();
		int[] customArray = {1,3,4,5};
		main.spofArray(customArray);
	}
}
