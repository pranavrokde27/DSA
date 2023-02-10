package section3_CrackingRecursion.lecture_18_22;

public class SumRecursion {
	public int sumofDigits(int n) {
		if(n == 0 || n<0) {
			return 0;
		}
		return n%10 + sumofDigits(n/10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SumRecursion sr = new SumRecursion();
		int result = sr.sumofDigits(999);
		System.out.println(result);
	}

}
