package section03_CrackingRecursion.lecture_18_22;

public class DecimalBinary {
		
		public int decimalBinary(int n) {
			if(n == 0) {
				return 0;
			}
			return n%2 + 10*decimalBinary(n/2);
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalBinary db = new DecimalBinary();
		var result = db.decimalBinary(10);
		System.out.println(result);
	}

}
