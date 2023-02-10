package section6.lecture_35_44;

public class Timecomplexity3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Timecomplexity3 pair = new Timecomplexity3();
		int[] customArray = {1,3,4,5};
		pair.printUnorderedPairs(customArray);
	}
	
	void printUnorderedPairs(int[] array) {
		for(int i = 0; i <array.length;i++) {       
			for(int j=i+1; j<array.length; j++) {   
				System.out.println(array[i] + ", "+array[j]);
				System.out.println("------------1st--------");
				System.out.println(array[j] + ", "+array[i]);
				System.out.println("------------2st--------");
			}
		}
	}

}


/*
//Time complexity is O(N^2) ...where we have one for loop under other for loop.

		//1.Counting Iterations                 2.Average work
			1st -----> n-1						 outer loop - N times						
			2nd -----> n-2							Inner loop ?
			      :									1st -----> 10   -|
			                                                           = 5-------> 10/2
			      :                                 2nd -----> 9     |   n ------> n/2
			      :                                       :
			(n-1)+(n-2)+(n-3)+..+2+1                      1 
			
			=1+2+...+(n-3)+(n-2)+(n-1)              n*n/2 = n^2/2 ------> O(n^2)
			=n(n-1)/2
			=n^2/2-n/2
			=n^2




*/