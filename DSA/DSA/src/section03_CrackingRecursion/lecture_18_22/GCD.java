package section03_CrackingRecursion.lecture_18_22;

public class GCD {
	
	public int gcd(int a, int b) {
		if(b == 0) {
			return a;
		}
		return gcd(b, a%b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GCD g = new GCD();
		int result = g.gcd(16, 4);
		System.out.println(result);
	}

}
