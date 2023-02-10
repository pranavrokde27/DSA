package section3_CrackingRecursion.lecture_18_22;

public class Power {
	
	public int power(int base, int exp) {
		if(exp == 0) {
			return 1;
		}
		return base * power(base, exp-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power p = new Power();
		int result = p.power(2, 2);
		System.out.println(result);
	}

}
