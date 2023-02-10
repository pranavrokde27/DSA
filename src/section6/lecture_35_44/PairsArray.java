package section6.lecture_35_44;

//Create a function which prints to the console the pairs from given array.
//Find the time complexity for created method.

public class PairsArray {
	
	void  pairsArray(int[] array) {
		for(int i=0; i <array.length;i++) {  //----------> O(N)
			for(int j=0; j < array.length; j++) {  //----------> O(N)
	 			System.out.println(array[i]+","+array[j]);    //----------> O(1)
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PairsArray pair = new PairsArray();
		int[] customArray = {1,3,4,5};
		pair.pairsArray(customArray);
	}

}



//Time complexity is O(N^2) ...where we have one for loop under other for loop.


