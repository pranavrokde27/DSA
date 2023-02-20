package section07_Arrays.lecture_45_63;

import java.util.Arrays;

public class CreatingTwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] int2DArray;  //--------------------------------->>O(1)
		//Step-1 Declare
		int2DArray = new int[3][3];  //--------------------------------->>O(1)
		//Step 2 Instantiate
		int2DArray[0][0] = 1;  //--------------------------------->>O(1)-----
//																			 |
		int2DArray[0][1] = 2;  //--------------------------------->>O(1)     |
		int2DArray[0][2] = 3;  //--------------------------------->>O(1)     |
		int2DArray[1][0] = 4;  //--------------------------------->>O(1)     |
		int2DArray[1][1] = 5;  //--------------------------------->>O(1)     |---->O(mn)
		int2DArray[1][2] = 6;  //--------------------------------->>O(1)     |
		int2DArray[2][0] = 7;  //--------------------------------->>O(1)     |
		int2DArray[2][1] = 8;  //--------------------------------->>O(1)     |
//		                                                                     |
		int2DArray[2][2] = 9;  //--------------------------------->>O(1)------
		
		//Step 3 Initialize
		System.out.println(Arrays.deepToString(int2DArray));
		
		//All Together
		
		String s2DArray[][] = {{"a","b"},{"c","d"}}; //--------------------------------->>O(1) Hence O(mn)
		
		System.out.println(Arrays.deepToString(s2DArray));
	}

}
