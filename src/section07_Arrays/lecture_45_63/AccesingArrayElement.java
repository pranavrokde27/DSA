package section07_Arrays.lecture_45_63;

public class AccesingArrayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SingleDimensionArray sd = new SingleDimensionArray(10);
		sd.insert(0,10);
		sd.insert(1,20);
		sd.insert(2,30);
		
		var firstElement = sd.arr[3];  //------------------O(1)
		System.out.println(firstElement); //------------------O(1)
	}


}
