package section02_Recursion.lecture_9_17;

public class Recursion {
	public int factorial(int n) {
		if(n<0) {
			return -1;
		}
		if(n == 0 ||  n == 1) {
			return 1;
		}

		return (n * factorial(n - 1));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Recursion r = new Recursion();
		int rec = r.factorial(5);
		System.out.println(rec + " fact");
		}
}
