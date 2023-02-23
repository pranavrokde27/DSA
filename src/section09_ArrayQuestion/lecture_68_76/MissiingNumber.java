package section09_ArrayQuestion.lecture_68_76;
//Find the missing number between 1 to 100 ?


public class MissiingNumber {
	
	
	public void missingNumber(int[] arrm) {
		int sum1 = 0;
		int sum2 = 0;
		for(int i: arrm) {
			sum1 += i;
		}
		System.out.println(sum1);
		sum2 = 10*(10+1)/2;
		
		System.out.println(sum2);
		int difference = sum2 - sum1;
		System.out.println("Missing Number is "+ difference);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissiingNumber mn = new MissiingNumber();
		int intArray[] = {1,2,3,4,5,6,7,8,10};
		
		mn.missingNumber(intArray);
		
	}
	
}
